package com.xw.test.testmybatisplus.test;

public class test03 {

    public static void main(String[] args) {
        Test02.ReturnOneParam lambda1 = a -> doubleNum(a);
        System.out.println(lambda1.method(3));

        Test02.ReturnOneParam lambda2 = test03::doubleNum;
        System.out.println(lambda2.method(3));

        test03 test = new test03();

        Test02.ReturnOneParam lambda04 = test::addTwo;
        System.out.println(lambda04.method(2));
    }



    /**
     * 要求
     * 1.参数的数量和类型要与接口中定义的一致
     * 2.返回值类型要与接口中定义的一致
     */
    public static int doubleNum(int a){

        return a * 2;
    }

    public int addTwo(int a) {

        return a + 2;
    }
}
