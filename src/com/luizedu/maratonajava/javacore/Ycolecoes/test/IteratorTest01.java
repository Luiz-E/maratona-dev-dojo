package com.luizedu.maratonajava.javacore.Ycolecoes.test;

import com.luizedu.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(5);
        mangas.add(new  Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Pokemon", 9.5, 5));
        mangas.add(new Manga(4L, "Berserk", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

        Iterator<Manga> iterator = mangas.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getQuantidade() == 0) {
                iterator.remove();
            }
        }
        System.out.println(mangas);
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
