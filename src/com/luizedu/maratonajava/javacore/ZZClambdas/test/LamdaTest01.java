package com.luizedu.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LamdaTest01 {
    public static void main(String[] args) {
        //forEach(List.of(1,2,3,4,5,6,7,8,9,10), e -> System.out.println(e));
        List<String> strings = List.of("William", "Suane", "Luffy", "Zoro");
        forEach(strings, s -> System.out.println(s));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
