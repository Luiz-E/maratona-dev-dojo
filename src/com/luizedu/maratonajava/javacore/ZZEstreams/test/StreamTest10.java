package com.luizedu.maratonajava.javacore.ZZEstreams.test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
//        Stream
//                .iterate(0, n -> n + 2)
//                .limit(10)
//                .forEach(System.out::println);
//
//        Stream
//                .iterate(new int[]{0, 1}, couple -> new int[]{couple[1], (couple[0] + couple[1])})
//                .limit(15)
//                .forEach(couple -> System.out.print(couple[0] + ", "));
//        System.out.println();
//        Stream
//                .iterate(new int[]{0, 1}, couple -> new int[]{couple[1], (couple[0] + couple[1])})
//                .limit(15)
//                .map(couple -> couple[0])
//                .forEach(n -> System.out.print(n + ", "));

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 500))
                .limit(15)
                .forEach(n -> System.out.print(n + " "));
    }
}
