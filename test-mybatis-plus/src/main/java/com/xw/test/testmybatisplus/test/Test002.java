package com.xw.test.testmybatisplus.test;
public class Test002 {

    public static void main(String[] args) {

        //无参数返回
        Test02.NoReturnNoParam noReturnNoParam = () -> {
            System.out.println("NoReturnNoParam");
        };
        noReturnNoParam.method();

        //过个参数无返回
        Test02.NoReturnMultiParam noReturnMultiParam = (int a , int b) -> {
            System.out.println("noReturnMultiParam：" + a +","+ b);
        };
        noReturnMultiParam.method(10,5);

        Test02.NoReturnOneParam noReturnOneParam = (int a) -> {
            System.out.println("noReturnOneParam："+ a);
        };
        noReturnOneParam.method(10);

        Test02.ReturnMultiParam returnMultiParam = (a ,b) -> {
            System.out.println("returnMultiParam："+ a+ ","+b);
            return a+b;
        };
        int method = returnMultiParam.method(1, 1);
        System.out.println("method："+method);
    }
}
