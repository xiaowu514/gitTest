package com.xw.test.testmybatisplus.rest;

public class IfElseTest {

    public static String demo1(int input) {

        if (input == 1) return "1";
        if (input ==2) return "2";

        return "3";
    }

    public static String demo2(int input) {

        if (input < 0 || input >1 ) throw new IllegalArgumentException();

        return input == 0 ? "yes" : "no";
    }

    public static void main(String[] args) {
        //System.err.println(demo1(4));

        System.err.println(demo2(1));
    }
}
