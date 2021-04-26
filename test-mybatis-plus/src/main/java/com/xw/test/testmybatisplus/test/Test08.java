package com.xw.test.testmybatisplus.test;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Test08 {

    public static boolean isExist(String bracket) {

        int i = 0;
        int j = 0;

        try {
            i = bracket.indexOf(")");
            j = bracket.indexOf("(");

            if (i>0 && j>0) {

                return true;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean isExists(String bracket) {

        try {

            int i = bracket.indexOf("*");
            int j = bracket.indexOf("+");

            if (i>0 && j>0) {

                return false;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    public static List<String> stringMouldCode(String cEngineerFigNo) {
        List<String> list = new ArrayList<>();
        try {
            String ss1 = StringUtils.substringBeforeLast(cEngineerFigNo, "(");
            String[] split = ss1.split("/");
            for (int i = 0; i < split.length; i++) {
                list.add(split[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> StringCavityNumber(String cavityNumber) {
        List<String> list = new ArrayList<>();
        try {

            String x1 = StringUtils.substringBetween(cavityNumber, "(", ")");

            String[] split1 = x1.split("/");
            for (int i = 0; i < split1.length; i++) {
                list.add(split1[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static int countString(String str,String s) {
        int count = 0,len = str.length();
        while(str.indexOf(s) != -1) {
            str = str.substring(str.indexOf(s) + 1,str.length());
            count++;
        }
        return count;
    }

    public static List<String> stringManipulation(String cEngineerFigNo) {
        List<String> list = new ArrayList<>();
        String x1 = StringUtils.substringBetween(cEngineerFigNo, "(", ")");

        String[] split1 = x1.split("/");
        if (split1.length > 1) {

            for (int i = 0; i < split1.length; i++) {
                String substring = split1[i].substring(1, 2);
                //如果穴数是*的取最大的数
                if (substring.equals("*")) {
                    //去*左边的数
                    String a1 = StringUtils.substringBeforeLast(split1[i], "*");
                    String a2 = StringUtils.substringAfter(split1[i], "*");

                    if (Integer.valueOf(a1) > Integer.valueOf(a2)) {
                        list.add(a1);
                    }
                    list.add(a2);
                } else {
                    String substring1 = split1[i].substring(0, 1);
                    list.add(substring1);
                }
            }
        } else {

            String substring = x1.substring(1, 2);
            //如果穴数是*的取最大的数
            if (substring.equals("*")) {
                System.err.println("substring:" + substring);
                //去*左边的数
                String a1 = StringUtils.substringBeforeLast(x1, "*");
                String a2 = StringUtils.substringAfter(x1, "*");

                if (Integer.valueOf(a1) > Integer.valueOf(a2)) {
                    list.add(a1);
                }
                list.add(a2);
            } else {
                String substring1 = x1.substring(0, 1);
                System.err.println(substring1 + "substring1");
                list.add(substring1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String bracket = "H20269/H20293(1*2)";
        /*boolean exist = isExist(bracket);
        boolean exists = isExists(bracket);
        int index1 = bracket.indexOf("*");
        int index2 = bracket.indexOf("+");
        if (!exist || !exists || (index1<0 && index2<0)) {

            System.err.println("进来了");
        }*/

        /*List<String> mouldCode = stringMouldCode(bracket);

        List<String> cavityNumber = StringCavityNumber(bracket);

        int count = countString(bracket, "(");

        if ((mouldCode.size()>cavityNumber.size() && cavityNumber.size()>1) || count>1 || count==0 ) {
            System.err.println("进来了");
        }*/
        List<String> strings = stringManipulation(bracket);
        System.err.println(strings.get(0).toString());
    }
}
