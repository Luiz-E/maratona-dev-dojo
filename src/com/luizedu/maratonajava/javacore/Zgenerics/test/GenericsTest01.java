package com.luizedu.maratonajava.javacore.Zgenerics.test;

import com.luizedu.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Midorya");
        list.add(new Consumidor("Goku").toString());
        for (String s : list) {
            System.out.println(s);
        }
//        add(list, new Consumidor("Midorya"));
        for (String s : list) {
            System.out.println(s);
        }

    }
//    private static void add(List<String> list, Consumidor consumidor) {
//        list.add(consumidor);
//    }
}
