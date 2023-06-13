package com.luizedu.maratonajava.javacore.Ycolecoes.test;

import com.luizedu.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga, Manga outroManga) {
        return manga.getId().compareTo(outroManga.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(5);
        mangas.add(new  Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L, "Pokemon", 9.5));
        mangas.add(new Manga(4L, "Berserk", 3.2));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));
        Collections.sort(mangas);
        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println(mangas);
    }
}
