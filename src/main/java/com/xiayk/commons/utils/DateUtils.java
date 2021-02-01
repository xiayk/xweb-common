package com.xiayk.commons.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private final static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Date strToDate(String str){
        try {
            return format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String dateToStr(Date date){
        return format.format(date);
    }

    public static String now(){
        return dateToStr(new Date());
    }

    public static Date nowTime(){
        return new Date();
    }
}
