package com.luizedu.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
//        Optional<String> o1 = Optional.of("aha uhu o devdojo é foda");
//        Optional<String> o2 = Optional.ofNullable(null);
//        Optional<String> o3 = Optional.empty();
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o3);
//        Optional<String> nameOptional = Optional.ofNullable(findName("William"));
//        String empty = nameOptional.orElse("EMPTY");
//        nameOptional.ifPresent(String::toUpperCase);
//        System.out.println(empty);

        //System.out.println(name.toUpperCase());
    }
    private static Optional<String> findName(String name) {
        List<String> names = List.of("william", "devdojo");
        int i = names.indexOf(name);
        if (i != -1) {
            return Optional.of(names.get(i));
        }
        return Optional.empty();
    }
}
