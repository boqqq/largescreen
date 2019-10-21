package com.dfjinxin.commons.core.id.impl;

import com.dfjinxin.commons.core.id.IdGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * ID生成器
 * snowflake 算法
 * 进程内生成Id
 */
@Slf4j
public class SnowflakeIdGenerator implements IdGenerator {
    //工作节点ID(0 - 31)
    private final long workerId;
    //数据中心ID(0 - 31)
    private final long datacenterId;
    //毫秒内序列号(0 - 4095)
    private long sequence = 0L;
    //上次生成ID的时间戳
    private long lastTimestamp = -1L;

    public SnowflakeIdGenerator(long datacenterId, long workerId) {
        Assert.isTrue(workerId < MAX_WORKER_ID && workerId >= 0,
                String.format("worker can't be greater than %d or less than 0", MAX_WORKER_ID));
        Assert.isTrue(datacenterId < MAX_DATACENTER_ID && datacenterId >= 0,
                String.format("datacenter can't be greater than %d or less than 0", MAX_DATACENTER_ID));

        log.info("创建 Snowflake IdGenerator: datacenter={}, worker={}", datacenterId, workerId);
        this.workerId = workerId;
        this.datacenterId = datacenterId;
    }

    @Override
    public List<Long> getIds(int count) {
        if (count > BATCH_MAX_COUNT || count <= 0) {
            throw new IllegalStateException("" + count + " 超过最大批次数量 " + BATCH_MAX_COUNT + " 或 小于等于零");
        }
        List<Long> result = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            result.add(getId());
        }

        return result;
    }

    @Override
    public synchronized Long getId() {
        long timestamp = System.currentTimeMillis();

        //如果当期时间小于上一次ID生成的时间戳，说明系统时钟回退过，这个时候应当抛出异常
        if (timestamp < lastTimestamp) {
            throw new RuntimeException("当期时间小于上一次记录的时间戳，系统时间可能发生回退");
        }

        //如果是同一时间生成的，则进行毫秒内序列
        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & SEQUENCE_MASK;
            //sequence 等于 0 说明毫秒内序列已经增长到最大值
            if (sequence == 0) {
                //阻塞到下一个毫秒，获得新的时间戳
                timestamp = tilNextMillos(lastTimestamp);
            }
        }
        //不是同一时间生成的,时间戳改变，毫秒内序列重置
        else {
            sequence = 0L;
        }

        //上次生成ID的时间戳
        lastTimestamp = timestamp;

        //移位并通过或运算拼到一起组成64位的ID
        return ((timestamp - INIT_TIME_STAMP) << TIMESTAMP_OFFSET)
                | (datacenterId << DATACENTER_OFFSET)
                | (workerId << WORKERID_OFFSET)
                | sequence;
    }

    private static long tilNextMillos(long lastTimestamp) {
        long timestamp = System.currentTimeMillis();
        while (timestamp <= lastTimestamp) {
            timestamp = System.currentTimeMillis();
        }
        return timestamp;
    }

    //初始时间戳 2018-08-28 00:00:00
    private static final long INIT_TIME_STAMP = 1535385600000L;
    //机器ID所占位数
    private static final long WORK_ID_BITS = 5L;
    //数据标识id所占的位数
    private static final long DATACENTER_ID_BITS = 5L;
    //支持的最大机器id,结果是31 将-1左移 5 位再取反 1111 1111 1111 1111 -> 1111 1111 1110 0000 -> 0000 0000 0001 1111 -> 31
    private static final long MAX_WORKER_ID = ~(-1L << WORK_ID_BITS);
    //支持的最大数据标识id，结果是31
    private static final long MAX_DATACENTER_ID = ~(-1L << DATACENTER_ID_BITS);
    //序列在id中占的位数
    private static final long SEQUENCE_BITS = 12L;
    //机器ID的偏移量（12）
    private static final long WORKERID_OFFSET = SEQUENCE_BITS;
    //数据中心id的偏移量(12+5)
    private static final long DATACENTER_OFFSET = SEQUENCE_BITS + DATACENTER_ID_BITS;
    //时间戳的偏移量(5+5+12)
    private static final long TIMESTAMP_OFFSET = SEQUENCE_BITS + WORK_ID_BITS + DATACENTER_ID_BITS;
    //生成序列的掩码 这里为4095
    //支持的最大机器id,结果是31 将-1左移 5 位再取反
    // 1111 1111 1111 1111
    // -> 1111 0000 0000 0000
    // -> 0000 1111 1111 1111
    // -> 4095
    //用来防止位数溢出
    private static final long SEQUENCE_MASK = ~(-1L << SEQUENCE_BITS);
}
