package com.xw.test.testmybatisplus.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream {

    public static void mapNumber() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> collect = numbers.stream().map(i -> i + i).distinct().collect(Collectors.toList());

        for (Integer list : collect){

            System.err.println("平方数为："+list);
        }
    }



    public static void limitTest() {

        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.err::println);

    }
    interface Mathoperation{
        int operation(int a,int b);
    }

    interface GreetingServer{
        void print(String message);
    }

    public static void java8Tester() {

        Mathoperation addition = (int a,int b) ->a+b;

        Mathoperation sub = (a,b) -> a-b;

        Mathoperation mul = (int a , int b) -> {return a*b; };

        Mathoperation div = (int a, int b) -> a/b;


        GreetingServer printInfo = (Info) -> System.err.println(Info);

        printInfo.print("10 + 5 = "+ addition.operation(5,10));
        printInfo.print("10 - 5 = "+sub.operation(5,10));
        printInfo.print("10 * 5 = "+mul.operation(5,10));
        printInfo.print("10 / 5 = "+div.operation(5,10));



    }

    public static void ListName() {
        List name = new ArrayList();

        name.add("zhangsan");
        name.add("lisi");
        name.add("wangwu");
        name.add("zhaoliu");

        name.forEach(System.err::println);
    }


    public static void main(String[] args) {
        //mapNumber();
        //limitTest();
        //java8Tester();
        ListName();
    }



}
