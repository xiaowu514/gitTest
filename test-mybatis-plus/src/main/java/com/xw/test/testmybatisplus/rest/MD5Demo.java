package com.xw.test.testmybatisplus.rest;
import org.springframework.util.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class MD5Demo {
    /*public static void main(String[] args) throws NoSuchAlgorithmException {
        GetMd532();
    }
    public static void GetMd532() throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");

        String s = DigestUtils.md5DigestAsHex("123456".getBytes());

        System.out.println(s);

    }*/
    public static void main(String[] args) {
        int secondTimestamp = getSecondTimestamp(new Date());
        System.out.println(secondTimestamp);
    }

    //计算传入时间的秒数
    public static int getSecondTimestamp(Date date){
        if (date == null) {
            return 0;
        }

        String timestamp = String.valueOf(date.getTime());
        int length = timestamp.length();
        if (length > 3) {
            return Integer.valueOf(timestamp.substring(0,length-3));
        } else {
            return 0;
        }
    }

}
