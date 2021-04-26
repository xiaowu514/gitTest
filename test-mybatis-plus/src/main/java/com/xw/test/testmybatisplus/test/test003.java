package com.xw.test.testmybatisplus.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class test003 {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(calendar.DATE,-1);

        String yesterDay= sdf.format(calendar.getTime()) + " " + "23:59:59";
        System.err.println(yesterDay);


        int i=1;
        int j = 1;

        if (i == 1) {
            System.err.println(1);
        }else if (j == 1) {
            System.err.println(2);
        }
    }
}
