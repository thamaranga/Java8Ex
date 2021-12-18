package com.hasitha;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("hasitha", "thamaranga", 29),
                new Person("amila", "perera", 30),
                new Person("kasun", "gamlath", 31),
                new Person("sunil", "perera", 32 ),
                new Person("sanath", "jayasuriya", 33),
                new Person("lasith", "malinga", 34)
        );

        people.stream().filter(p->p.getLastName().startsWith("p")).distinct().forEach(p-> System.out.println(p));
    }
}
