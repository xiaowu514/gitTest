package com.xw.test.testmybatisplus.rest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class getWeekDay {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        //过去七天
        c.setTime(date);
        c.add(Calendar.DATE, - 6);
        Date d = c.getTime();
        String day = format.format(d);

        //过去一月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        String mon = format.format(m);
        System.out.println("一周时间："+day+"一个月后的时间："+mon);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if (false) {
            calendar.add(Calendar.DATE, -1);
        }
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(calendar.getTime());
        System.out.println(dateStr);

    }
}
