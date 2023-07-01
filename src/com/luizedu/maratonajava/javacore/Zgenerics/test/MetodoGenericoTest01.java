package com.luizedu.maratonajava.javacore.Zgenerics.test;

import com.luizedu.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
//        criarArrayComUmObjeto(new Barco("Canona Marota"), new Barco("Iate"));
    }

    private static <T extends Comparable> List<T> criarArrayComUmObjeto(T... t) {
        return List.of(t);
    }

}
