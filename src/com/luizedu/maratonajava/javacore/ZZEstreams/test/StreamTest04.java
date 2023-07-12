package com.luizedu.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavao Mendes", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

//        for (List<String> people : devdojo) {
//            for (String person : people) {
//                System.out.println(person);
//            }
//        }

        devdojo
                .stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
