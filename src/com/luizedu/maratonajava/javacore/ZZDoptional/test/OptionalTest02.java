package com.luizedu.maratonajava.javacore.ZZDoptional.test;

import com.luizedu.maratonajava.javacore.ZZDoptional.domain.Manga;
import com.luizedu.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);
        MangaRepository.findById(2).orElseThrow(IllegalAccessError::new);
        Manga newManga = MangaRepository.findByTitle("Drifters").orElse(new Manga(3, "Drifters", 28));
    }
}
