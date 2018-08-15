package com.liuyi.day14.iccase;

import com.liuyi.day14.DateUti;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vv on 2018/8/14.
 * 这是日期和字符串相互转换的工具类
 */
public class DateUtil {
    private DateUtil() {
    }

    /**
     * 功能：把日期转换为字符串
     *
     * @param d      传入日期
     * @param format 格式化要求
     * @return 格式化后的字符串
     */
    public static String dateToString(Date d, String format) {
        return new SimpleDateFormat(format).format(d);
    }

    /**
     * 功能：将字符串转换为 日期
     *
     * @param str    被解析的字符串
     * @param format 传递过来的要被转换的格式
     * @return 解析后的日期对象
     * @throws ParseException
     */
    public static Date stringToDate(String str, String format) throws ParseException {
        return new SimpleDateFormat(format).parse(str);
    }


}
