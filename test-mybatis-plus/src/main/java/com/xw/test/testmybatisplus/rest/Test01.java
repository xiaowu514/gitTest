package com.xw.test.testmybatisplus.rest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {

    public static void main(String[] args) {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        //当前时间往后八周
//        String[] oneWeek = new String[8];
//        //过去八周时间前面
//        for(int i=0; i<=7; i++){
//            Calendar c = Calendar.getInstance();
//            c.setTime(new Date());
//            c.add(Calendar.DATE, - 6*(i+1)-i);
//            Date d = c.getTime();
//            oneWeek[i] = format.format(d);
//            System.out.println(oneWeek[i]);
//        }
        /*c.add(Calendar.DATE, - 7);
        Date d = c.getTime();
        String day = format.format(d);
        System.out.println("过去七天："+day);
        Date date = new Date();
        System.out.println(date.getTime());*/
           /* Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = sdf.format(calendar.getTime());
            System.out.println(dateStr);*/
        /*Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(calendar.getTime());
        System.out.println(dateStr);*/


       /* String materialName = "400400";
        if (materialName.length()>20){

        String substring = materialName.substring(0, 17);
        System.err.println(substring+"...");
        }
        System.err.println(materialName);*/


        String str = "(越南)L50*W44*H31.5mm CHG1145白色底盖/材质:PC/防火94V-0/符合RoHS/REACH/加州65.(客指厂家：濠景达)";

        System.err.println(str.length());
        int i = "H16115((3*2+4)".indexOf(")");
        int j = "H16115(3*2+4))".indexOf(")");

        if (i>0 && j>0) {

            System.err.println("进来");
        }

        Double p = 192.00;
        Long l = 192l;

        System.err.println();

    }
}
