package com.xw.test.testmybatisplus.rest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {


    public static void main(String[] args) throws FileNotFoundException {
       /* List<String> list = Arrays.asList("A", "B", "c", "d");

        Map<Integer, String> map = list.stream().collect(Collectors.toMap(String::length, Function.identity(), (before, after) -> before));
        System.err.println(map);*/
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\xw\\Desktop\\git.txt"));
        Stream<String> lines = bufferedReader.lines();
        //lines.forEach(System.out::println);

        Pattern compile = Pattern.compile(",");
        Stream<String> stringStream = compile.splitAsStream("a,b,c,d");
        //stringStream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1,3, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 7);
        Stream<Integer> integerStream1 = integerStream.filter(s -> s > 3)
                .distinct()
                .skip(2)
                .limit(2);

        //integerStream1.forEach(System.out::println);

        List<String> strings = Arrays.asList("a,b,c", "1,2,3");

        //将每一个元素转换成一个新的且不带逗号的元素
        Stream<String> stringStream1 = strings.stream().map(s -> s.replaceAll(",", ""));
        stringStream1.forEach(System.out::println);

        Stream<String> stringStream2 = strings.stream().flatMap(s -> {
            //将每一个元素换成stream
            String[] split = s.split(",");
            Stream<String> stream = Arrays.stream(split);
            return stream;
        });
        stringStream2.forEach(System.out::println);
    }
}
