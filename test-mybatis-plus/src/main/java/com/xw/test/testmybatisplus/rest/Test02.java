package com.xw.test.testmybatisplus.rest;

import net.sourceforge.pinyin4j.PinyinHelper;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {

    /**
     * 获取汉字拼音的方法。如： 张三 --> zhangsan
     * 说明：暂时解决不了多音字的问题，只能使用取多音字的第一个音的方案
     * @param hanzi 汉子字符串
     * @return 汉字拼音; 如果都转换失败,那么返回null
     */
    public static String getHanziPinYin(String hanzi) {
        String result = null;
        if(null != hanzi && !"".equals(hanzi)) {
            char[] charArray = hanzi.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (char ch : charArray) {
                // 逐个汉字进行转换， 每个汉字返回值为一个String数组（因为有多音字）
                String[] stringArray = PinyinHelper.toHanyuPinyinStringArray(ch);
                if(null != stringArray) {
                    // 把第几声这个数字给去掉
                    sb.append(stringArray[0].replaceAll("\\d", ""));
                }
            }
            if(sb.length() > 0) {
                result = sb.toString();
            }
        }
        return result;
    }

    public static String currentTime () {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");

            String dateType = simpleDateFormat.format(date).trim();
            // 对带有符号的处理（"/",".","-"）
            if (dateType.contains("/") || dateType.contains(".") || dateType.contains("-")) {
                String midd2 = "";
                String back = dateType.substring(0, 4);
                if (dateType.contains("/")) {
                    midd2 = dateType.replace("/", "-");
                }
                if (dateType.contains(".")) {
                    midd2 = dateType.replace(".", "-");
                }
                if (dateType.contains("-")) {
                    midd2 = dateType.replace("-", "-");
                }
                if (dateType.length() < 8) {
                    int midd = Integer.valueOf(midd2.substring(midd2.lastIndexOf("-") + 1));
                    if (midd < 10) {
                        back += "0" + String.valueOf(midd);
                    } else {
                        back += String.valueOf(midd);
                    }
                }
                if (dateType.length() >= 8) {
                    int midd = Integer.valueOf(midd2.substring(midd2.indexOf("-") + 1, midd2.lastIndexOf("-")));
                    if (midd < 10) {
                        back += "0" + String.valueOf(midd);
                    } else {
                        back += String.valueOf(midd);
                    }

                    int midd1 = Integer.valueOf(midd2.substring(midd2.lastIndexOf("-") + 1));
                    if (midd1 < 10) {
                        back += "0" + String.valueOf(midd1);
                    } else {
                        back += String.valueOf(midd1);
                    }
                }
                dateType = back;
            }
            return dateType;
    }

    public static String dataTime(){
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.err.println(date);
        String format = sdf.format(date);

        return format;
    }

    public static void main(String[] args) {
        String s = currentTime();
        System.err.println(s);


        System.err.println(dataTime());
    }
}
