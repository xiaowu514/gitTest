package com.xw.test.testmybatisplus.rest;

import sun.misc.Signal;

public class EnumDemo {
    enum Signal {RED, YELLOW, GREEN};
    public static void main(String[] args) {

        String trafficInstruct = getTrafficInstruct(Signal.RED);
        System.out.println(trafficInstruct);

    }


    public static String getTrafficInstruct(Signal signal) {
        String instruct = "信号灯故障";
        switch (signal) {
            case RED:
                instruct = "红灯停";
                break;
            case GREEN:
                instruct = "绿灯行";
                break;
            case YELLOW:
                instruct = "黄灯等一等";
                break;
            default:
                break;
        }
        return instruct;
    }
}
