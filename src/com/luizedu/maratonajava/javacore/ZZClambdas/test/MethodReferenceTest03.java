package com.luizedu.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        names.sort(String::compareTo);
        System.out.println(names);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10") + 2);

        BiPredicate<List<String>, String> checkIfThereIsName = List::contains;
        System.out.println(checkIfThereIsName.test(names, "Rimuru"));
    }
}
