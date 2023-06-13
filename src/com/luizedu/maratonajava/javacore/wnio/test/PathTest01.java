package com.luizedu.maratonajava.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("folder/arquivo.txt");
        Path p2 = Paths.get("folder/", "arquivo.txt");
        System.out.println(p2.getFileName());
    }
}
