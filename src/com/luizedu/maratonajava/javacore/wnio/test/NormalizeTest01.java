package com.luizedu.maratonajava.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/luiz/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        Path path2 = Paths.get("/home/./luiz/./dev/");
        System.out.println(path1);
        System.out.println(path1.normalize());
        System.out.println(path2.normalize());
    }
}
