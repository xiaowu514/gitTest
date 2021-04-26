package com.xw.test.testmybatisplus.test;

import lombok.Data;

@Data
public class Item {

    private int id;
    private String s;
    private double v;

    public Item() {
    }

    public Item(int id, String s, double v) {
    }

}
