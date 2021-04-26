package com.xw.test.testmybatisplus.test;

public class Test06 {

    private static final long count = 100000;
    public static void main(String[] args) throws InterruptedException {

        concurrency();
        serial();
    }

    private static void concurrency() throws InterruptedException {

        long start = System.currentTimeMillis();

        Runnable target;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();
        //并行执行
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        thread.join();
        long time = System.currentTimeMillis() - start;

        System.out.println("concurrency：" + time + "ms");
    }

    private static void serial() {
        long start = System.currentTimeMillis();

        int a = 0;
        for (int i = 0; i < count; i++) {
            a += 5;
        }

        //串行执行
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }

        long time = System.currentTimeMillis() - start;
        System.out.println("serial：" + time + "ms");
    }

}
