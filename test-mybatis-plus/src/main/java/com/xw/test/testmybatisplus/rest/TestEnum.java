package com.xw.test.testmybatisplus.rest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestEnum {
    enum Color {RED, GREEN ,BLUE;}
    enum Size {BIG, MIDDLE, SMALL;}

    public static void main(String[] args) {
        System.out.println("==========Print All Color==========");
        for (Color c : Color.values()) {
            System.out.println(c + "ordinal:" + c.ordinal());
        }
        for (Size s : Size.values()){
            System.out.println(s + "ordinal:" + s.ordinal());
        }

        Color green = Color.GREEN;
        System.out.println(green.name());
        System.out.println(green.getDeclaringClass());
        System.out.println(green.hashCode());
        System.out.println(green.compareTo(Color.BLUE));
    }
}
