package com.xw.test.testmybatisplus.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test05 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        Collections.addAll(list,1,2,3,4,5);

        //lambda表达式引用方法
        list.forEach(System.out::println);

        list.forEach(element -> {
            if (element % 2 ==0) {
                System.out.println(element);
            }
        });

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(7, "格力空调", 888.88 ));
        items.add(new Item(17, "肥皂", 2.00 ));
        items.add(new Item(9, "冰箱", 4200.00 ));

        items.removeIf(ele -> ele.getId() == 7);

        items.forEach(System.out::println);

        items.sort((o1, o2) -> o1.getId() - o2.getId());
        System.out.println(items);

        items.clear();
        items.forEach(System.out::println);
    }
}
