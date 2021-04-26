package com.xw.test.testmybatisplus.test;

import com.xw.test.testmybatisplus.utils.CommonUtil;

import javax.xml.ws.EndpointReference;

public class CommonUtilTest {
    public static void main(String[] args) {
//        String mouldCodes = "H1234,H2345,H3456,H56641,";
//
//        String s = CommonUtil.trimSeparator(mouldCodes, ",");
//
//        System.err.println(s);
        if ("https://develo.mosucloud.com/musumusu/".contains("develop")) {
            System.err.println("存在");
        }else {
            System.err.println("不存在");
        }

    }
}
