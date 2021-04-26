package com.xw.test.testmybatisplus.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class orgNameTest {

    public static void main(String[] args) throws ParseException {
        /*String[] orgName = {"A组","B组","C组","D组"};
        for (String name:orgName) {
            System.err.println(name);
        }

        String id = "1007l";

        System.err.println(id.length());

        String s = yesterDayTime();
        System.err.println(s);*/



        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeQuantum = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date0 = timeQuantum.format(new Date());
        String date1 = sdf.format(new Date()) + " " + "17:39:00";
        String date5 = sdf.format(new Date()) + " " + "17:50:59";

        Long shiftJudge = 2L;
        if (shiftJudge == 1L || (shiftJudge == 2L && timeQuantum.parse(date5).after(timeQuantum.parse(date0)) && timeQuantum.parse(date0).after(timeQuantum.parse(date1)))) {
            //orderReportRecord.setProducedDate(DateUtil.formatDate(new Date(),DateUtil.DEFAULT_DATE_FORMAT));
            System.err.println("第一个"

            );
        } else {
            //orderReportRecord.setProducedDate(yesterday());
            System.err.println("第二个");

        }




    }

    private static String yesterDayTime() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(calendar.DATE,-1);

        String yesterDay= sdf.format(calendar.getTime());

        return yesterDay;
    }
}
