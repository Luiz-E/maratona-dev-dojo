package com.luizedu.maratonajava.javacore.ZZDoptional.repositorio;

import com.luizedu.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku no Hero", 50), new Manga(2, "Overlord", 25));

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(t -> t.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(t -> t.getId().equals(id));
    }
}