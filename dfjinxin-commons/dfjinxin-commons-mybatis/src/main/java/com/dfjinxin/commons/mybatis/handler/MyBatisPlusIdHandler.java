package com.dfjinxin.commons.mybatis.handler;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.dfjinxin.commons.core.id.IdGenerator;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

public class MyBatisPlusIdHandler implements MetaObjectHandler {
    private static final String ID = "id";
    private static final String CREATE_TIME = "createTime";
    private static final String UPDATE_TIME = "updateTime";

    private final IdGenerator idGenerator;

    public MyBatisPlusIdHandler(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    /**
     * 判断id为空时自动填充IdGenerator生成器生成的id
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject == null) {
            return;
        }

        if (metaObject.hasGetter(ID) && metaObject.hasSetter(ID)
                && metaObject.getGetterType(ID).equals(Long.class)
                && metaObject.getSetterType(ID).equals(Long.class)) {
            Long value = (Long) metaObject.getValue(ID);
            if (value == null || value < 0) {
                metaObject.setValue(ID, idGenerator.getId());
            }
        }
        setFieldValByNameIfNull(CREATE_TIME, LocalDateTime.now(), metaObject);
        setFieldValByNameIfNull(UPDATE_TIME, LocalDateTime.now(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByNameIfNull(UPDATE_TIME, LocalDateTime.now(), metaObject);
    }

    private void setFieldValByNameIfNull(String fieldname, Object value, MetaObject metaObject) {
        if (metaObject.hasGetter(fieldname) && metaObject.hasSetter(fieldname)) {
            Object existValue = metaObject.getValue(fieldname);
            if (existValue == null) {
                setFieldValByName(fieldname, value, metaObject);
            }
        }
    }
}
