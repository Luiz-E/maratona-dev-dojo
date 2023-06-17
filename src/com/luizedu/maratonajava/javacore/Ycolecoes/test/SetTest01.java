package com.luizedu.maratonajava.javacore.Ycolecoes.test;

import com.luizedu.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new  Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Pokemon", 9.5, 5));
        mangas.add(new Manga(4L, "Berserk", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(1L, "Pokemon", 9.5, 5));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //mangas.forEach(System.out::println);
    }
}
