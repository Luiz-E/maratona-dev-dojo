package com.luizedu.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
//        List<String> names = List.of("luiz", "andré", "carlos");
        List<String> strings = List.of("Natsu", "Allucard");
        List<Integer> lengthOfNames = map(strings, s -> s.length());
        List<String> upper = map(strings, s -> s.toUpperCase());
        System.out.println(lengthOfNames);
        System.out.println(upper);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for(T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }

}
