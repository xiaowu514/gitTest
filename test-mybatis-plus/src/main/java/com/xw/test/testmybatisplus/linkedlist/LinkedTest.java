package com.xw.test.testmybatisplus.linkedlist;

public class LinkedTest {

    public static void main(String[] args) {

        DuiLie duiLie = new DuiLie();

        duiLie.myAdd("abc1");
        duiLie.myAdd("abc2");
        duiLie.myAdd("abc3");
        duiLie.myAdd2("abc4");
        duiLie.myAdd2("abc5");

        /*while (!duiLie.isNull()) {
            System.err.println(duiLie.myGet());
        }*/

        //System.err.println(duiLie.pollFirst());

        String str = new String("abc");
        String str2 = new String("abc");

        System.err.println(str == str2);

        System.err.println(str == str);
    }
}
