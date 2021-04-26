package com.xw.test.testmybatisplus.test;

public class Test01 {

    public static void main(String[] args) {
        //匿名内部类
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类的方式！！！");
            }
        };

        /**
         *Lambda表达式
         *左侧：指定了lambda表达式的所有参数
         * 右侧：指定了lambda体，
         */
        //语法一：无参，无返回值，只需要一条语句
        Runnable r2 = () -> System.out.println("我是Lambda");

        r1.run();
        r2.run();
        //语法二：lambda需要一个参数（如果只有一个参数，参数的小括号可以省略）
        /*Customer c = (n) -> System.out.println(n);
        c.fun();*/

    }
}
