package com.luizedu.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(2, 0, 4, 3));

        Collections.sort(numeros);

        System.out.println(Collections.binarySearch(numeros, 1));
    }
}
