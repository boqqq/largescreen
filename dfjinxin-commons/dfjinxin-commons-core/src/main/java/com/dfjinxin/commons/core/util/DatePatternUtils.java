package com.dfjinxin.commons.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public final class DatePatternUtils {
    private DatePatternUtils() {
    }

    public static final String DATE_PATTERN = "yyyy-MM-dd";

    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE_TIME_STAMP = "yyyyMMddHHmmss";

    public static final String DATE_TIME_STAMP_WITHOUT_SECOND = "yyyyMMddHHmm";

    public static final String DATE_STAMP = "yyyyMMdd";
    public static final String DATE_STAMPYM = "yyyyMM";

    public static final String TIME_PATTERN = "HH:mm:ss";

    public static final String TIME_PATTERN_WITHOUT_SECOND = "HH:mm";

    public static final String YEAR_MONTH = "yyyy-MM";

    public static final String DATE_AM_PM = "HH:mm a";

    public static final String DATE_TIME = "yyyy年MM月dd日 HH:mm";

    public static final String DATE = "yyyy年MM月dd日";

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN);

    public static final DateTimeFormatter DATE_TIME_STAMP_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_STAMP);

    public static final DateTimeFormatter DATE_TIME_STAMP_WITHOUT_SECOND_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_STAMP_WITHOUT_SECOND);

    public static final DateTimeFormatter DATE_STAMP_FORMATTER = DateTimeFormatter.ofPattern(DATE_STAMP);

    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_PATTERN);

    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);

    public static final DateTimeFormatter YEAR_MONTH_FORMATTER = DateTimeFormatter.ofPattern(YEAR_MONTH);

    public static final DateTimeFormatter DATE_AM_PM_FROMATTER = DateTimeFormatter.ofPattern(DATE_AM_PM);

    public static final DateTimeFormatter DATE_TIME_PATTERN_FORMATTER = DateTimeFormatter.ofPattern(TIME_PATTERN_WITHOUT_SECOND);

    public static final DateTimeFormatter DATE_TIME_WITHOUT_SECOND = DateTimeFormatter.ofPattern(TIME_PATTERN_WITHOUT_SECOND);

    private static final SimpleDateFormat dateFormatNot = new SimpleDateFormat(DATE_STAMPYM);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);

    /**
     * 解析日期
     */
    public synchronized static Date parseDate(String str) {
        Date date = null;
        try {
            date = dateFormatNot.parse(str);
        } catch (ParseException e) {
        }
        return date;
    }
    /**
     * 格式化日期 yyyy-MM-dd
     */
    public synchronized static String formatDate(Date date) {
        if(null == date){
            return "";
        }
        return dateFormat.format(date);
    }
}
