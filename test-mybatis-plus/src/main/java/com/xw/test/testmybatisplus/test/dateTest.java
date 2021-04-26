package com.xw.test.testmybatisplus.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class dateTest {


    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(new Date());
        //System.err.println(format);
        String date = sdf1.format(new Date()) + " " + "08:00:00";
        //System.err.println(date);
//        try {
//            Date parse = sdf.parse(date);
//
//            System.err.println("当前时间："+sdf.format(parse));
//            //before()和after()比较
//            System.err.println(new Date().after(parse));
//        } catch (ParseException e) {
//            e.printStackTrace();
//            System.out.println("字符串转换类型发生错误");
//        }
//        Calendar calendar = new GregorianCalendar();
//
//        calendar.setTime(new Date());
//
//        calendar.add(calendar.DATE,-1);
//
//        String date2= sdf1.format(calendar.getTime()) + " " + "08:00:00";
//
//        System.out.println(date2);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("aaa", 111l);
        map.put("bbb", 222l);
        map.put("ccc", 333l);
        map.put("ddd", 444l);

        Long rejectNums = (Long) map.get("000");
        if (rejectNums == null) {
            System.err.println("jinlail");
            map.put("123",111l);

        } else {
            map.put("aaa",111l+rejectNums);
        }
         //Map集合循环遍历方式一  
        System.out.println("第一种：通过Map.keySet()遍历key和value：");
        for(String key:map.keySet()){//keySet获取map集合key的集合  然后在遍历key即可
        String value = map.get(key).toString();//
        System.out.println(key+":"+value);


        }
        int o = 0/4;
        System.err.println("-----------"+o);
    }
}
