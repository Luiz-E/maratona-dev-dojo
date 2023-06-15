package com.luizedu.maratonajava.javacore.Ycolecoes.test;

import com.luizedu.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(5);
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L, "Pokemon", 9.5));
        mangas.add(new Manga(4L, "Berserk", 3.2));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga target = new Manga(2L, "Dragon Ball Z", 2.99);

        System.out.println(Collections.binarySearch(mangas, target));
    }
}
