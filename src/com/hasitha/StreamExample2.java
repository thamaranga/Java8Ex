package com.hasitha;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {

    public static void main(String[] args) {

        IntStream.range(1,10).forEach(p->System.out.println(p));
        System.out.println("************");
        IntStream.range(1,10).forEach(System.out:: println);
        System.out.println("************");
        IntStream.range(1,10).skip(5).forEach(p-> System.out.println(p));
        System.out.println("************");
        long sum= IntStream.range(1,10).sum();
        System.out.println("sum is "+sum);
        System.out.println("************");
        Stream.of("sanath", "mavan","mahela","sanga").sorted().findFirst().ifPresent(p-> System.out.println(p));
        System.out.println("************");
        String[] names={"sanath","sanga","mahela","kusal"};
        Arrays.stream(names).filter(p->p.startsWith("s")).sorted().forEach(p-> System.out.println(p));
        System.out.println("************");
        int[] numbers={1,2,3,4,5};
        Arrays.stream(numbers).map(p->p*p).average().ifPresent(p-> System.out.println(p));
        System.out.println("************");
        List<String> namesList= Arrays.asList("sanAth","saNga","MaheLa","kUsaL");
        namesList.stream().map(String::toLowerCase).filter(p->p.startsWith("m")).forEach(System.out::println);
        System.out.println("************");

    }
}
