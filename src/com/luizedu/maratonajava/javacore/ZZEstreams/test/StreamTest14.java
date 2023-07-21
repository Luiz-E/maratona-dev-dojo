package com.luizedu.maratonajava.javacore.ZZEstreams.test;

import com.luizedu.maratonajava.javacore.ZZEstreams.dominio.Category;
import com.luizedu.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import com.luizedu.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.luizedu.maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static com.luizedu.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels
                .stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.counting()));

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(
                        Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(
                        Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);
    }
}
