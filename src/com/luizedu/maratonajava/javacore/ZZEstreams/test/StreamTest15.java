package com.luizedu.maratonajava.javacore.ZZEstreams.test;

import com.luizedu.maratonajava.javacore.ZZEstreams.dominio.Category;
import com.luizedu.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import com.luizedu.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.luizedu.maratonajava.javacore.ZZEstreams.dominio.Promotion.*;
import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(
                        groupingBy(
                            LightNovel::getCategory,
                            Collectors.summarizingDouble(LightNovel::getPrice)
                        )
                );

        Map<Category, LinkedHashSet<Promotion>> collect1 = lightNovels.stream()
                .collect(
                        groupingBy(
                                LightNovel::getCategory,
                                Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))
                        )
                );
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
