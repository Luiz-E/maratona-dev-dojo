package com.luizedu.maratonajava.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/luiz");
        Path clazz = Paths.get("/home/luiz/devojofoda/OlaMundo.java");
        Path pathToClass = dir.relativize(clazz);

        Path absoluto1 = Paths.get("/home/luiz");
        Path absoluto2 = Paths.get("/home/luiz");
        Path absoluto3 = Paths.get("/home/luiz");

    }
}
