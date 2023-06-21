package com.luizedu.maratonajava.javacore.Ycolecoes.test;

import com.luizedu.maratonajava.javacore.Ycolecoes.dominio.Manga;
import com.luizedu.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone smartphone, Smartphone t1) {
        return smartphone.getMarca().compareTo(t1.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga, Manga t1) {
        return Double.compare(manga.getPreco(), t1.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
//        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
//        Smartphone smartphone = new Smartphone("123", "Nokia");
//        set.add(smartphone);
//        System.out.println(set);
//        NavigableSet<Manga> mangas = new TreeSet<>();
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Pokemon", 9.5, 5));
        mangas.add(new Manga(4L, "Berserk", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(1L, "Pokemon", 9.5, 5));
        mangas.add(new Manga(10L, "Aaragon", 9.5, 5));
        mangas.add(new Manga(11L, "Aaragon", 9.5, 5));
        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        //lower <
        // floor <=
        // higher >
        // ceiling >=

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 3.2, 5);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("lower: " + mangas.lower(yuyu));
        System.out.println("floor: " + mangas.floor(yuyu));
        System.out.println("Higher: " + mangas.higher(yuyu));
        System.out.println("ceiling: " + mangas.ceiling(yuyu));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println("----------------------------------------------------------------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
    }
}
