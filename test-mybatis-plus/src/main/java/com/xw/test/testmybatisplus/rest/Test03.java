package com.xw.test.testmybatisplus.rest;

import com.baomidou.mybatisplus.extension.api.R;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

    public static List<String> stringManipulations(){
        String s1 = "14124/15013/16047/19146-D147-E187-F188-G200-H(1*8)";
        /*
        模号(产品模号不规范的情况下如何拿到需要的模号和模穴数)
        H19148-D149-E189-F190-G191-H192-J202-K(1*4)H15014(1*2)
        14124/15013(1*2)/16047/19146-D147-E(1*4)187-F188-G200-H(1*8)
        H19150(D)H19151(E)H19193(F)H19194(G)H19203(H)1*4(DE)/1*8(FGH
        */

        List<String> list = new ArrayList<>();
        try {

            String x1 = StringUtils.substringBetween(s1, "(", ")");

            String[] split1 = x1.split("/");
            for (int i = 0; i < split1.length; i++) {
                list.add(split1[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> StringCavityNumber() {
        String s1 = "14124/15013/16047/19146-D147-E187-F188-G200-H(1*8)";
        List<String> list = new ArrayList<>();
        String ss1 = StringUtils.substringBeforeLast(s1, "(");
        String[] split = ss1.split("/");
        for (int i = 0; i < split.length; i++) {
            list.add(split[i]);
        }
        return list;
    }
    public static List<String> stringManipulation(){
        String s1 = "14124/15013/16047/19146-D147-E187-F188-G200-H(1*8)";
        List<String> list = new ArrayList<>();
        String x1 = StringUtils.substringBetween(s1, "(", ")");

        String[] split1 = x1.split("/");
        if(split1.length>1) {

            for(int i=0;i<split1.length;i++){
                String substring = split1[i].substring(1,2);
                //如果穴数是*的取最大的数
                if(substring.equals("*")){
                    //去*左边的数
                    String a1 = StringUtils.substringBeforeLast(split1[i], "*");
                    String a2 = StringUtils.substringAfter(split1[i], "*");

                    if(Integer.valueOf(a1)>Integer.valueOf(a2)){
                        list.add(a1);
                    }
                    list.add(a2);
                } else {
                    String substring1 = split1[i].substring(0, 1);
                    list.add(substring1);
                }
            }
        } else {

                String substring = x1.substring(1,2);
                //如果穴数是*的取最大的数
                if(substring.equals("*")){
                    System.err.println("substring:"+substring);
                    //去*左边的数
                    String a1 = StringUtils.substringBeforeLast(x1, "*");
                    String a2 = StringUtils.substringAfter(x1, "*");

                    if(Integer.valueOf(a1)>Integer.valueOf(a2)){
                        list.add(a1);
                    }
                    list.add(a2);
                } else {
                    String substring1 = x1.substring(0, 1);
                    System.err.println(substring1+"substring1");
                    list.add(substring1);
                }
        }
            return list;
    }

    public static String subString() {
        String s1 = "14124/15013/16047/19146-D147-E187-F188-G200-H(1*8)";

        return s1.substring(0,s1.indexOf("("));
    }

    public static void countString(String str,String s) {
        int count = 0,len = str.length();
        while(str.indexOf(s) != -1) {
            str = str.substring(str.indexOf(s) + 1,str.length());
            count++;
        }

        System.out.println("此字符串有" + count + "个" + s);
    }

    public static String Test() {
        if ((3>1 && 3>1) || 2>1) {


            return "成立";

        }
        return "...";
    }

    public static boolean isExist() {
        String str = "H20168/H20169/20170/20171/20172/20173/20174/20175/20176(1*32)";
        int i = str.indexOf(")");
        int j = str.indexOf("(");
        boolean exice = false;
        if (i>0 && j>0) {
            System.err.println(i);


            return true;
        }
        System.err.println("false");


        return false;
    }

    public static void main(String[] args) {
        /*List<String> list = stringManipulation();
        System.err.println(list);

        List<String> strings = stringManipulations();
        System.err.println(strings);

        List<String> strings1 = StringCavityNumber();
        System.err.println(strings1);*/


       /* System.err.println(subString());


        Date date = new Date();

        long time = date.getTime();
        System.err.println(time);*/

        //countString("H18263/YM-SH18177","(");
        //System.err.println(Test());

//        boolean exist = isExist();
//        System.err.println(exist);
//        if (exist) {
//            System.err.println("有的");
//        }
        String i = "sdsds*dsds";


        int i1 = i.indexOf("*");
        int i2 = i.indexOf("+");

        if (i1<0 && i2<0) {
            
        }

        System.err.println(i1);
    }


}
