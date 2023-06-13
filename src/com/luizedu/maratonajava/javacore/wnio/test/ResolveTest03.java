package com.luizedu.maratonajava.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/luiz");
        Path arquivo = Paths.get("/dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/luiz");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

    }
}
