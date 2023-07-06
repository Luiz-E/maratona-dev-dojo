package com.luizedu.maratonajava.javacore.ZZClambdas.test;

import com.luizedu.maratonajava.javacore.ZZClambdas.dominio.Anime;
import com.luizedu.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
//        Collections.sort(animeList, (a1, a2) -> AnimeComparators.compareByTitle(a1,a2));
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
