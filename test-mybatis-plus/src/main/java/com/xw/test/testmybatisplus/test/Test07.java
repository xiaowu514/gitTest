package com.xw.test.testmybatisplus.test;

class Person {

    int age;

}
public class Test07 {

    public static void main(String args[]) {

        int a1 = 18;
        Person person = new Person();
        person.age = 18;

        change(a1,person);
        System.err.println("a1="+a1+",and person.age="+person.age);

    }

    static void change(int a1, Person person){

        a1 = 20;
        person.age = 2021;
        System.err.println("a1="+a1+",and person.age="+person);
    }

}
