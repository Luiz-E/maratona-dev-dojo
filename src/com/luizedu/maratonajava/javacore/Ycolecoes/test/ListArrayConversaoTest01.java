package com.luizedu.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("------------------");
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        System.out.println("------------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(29);
        System.out.println(numerosList);
        System.out.println("-------------------------");
        List<String> list = Arrays.asList("1", "2");
        List<String> strings = List.of("1", "2");
        System.out.println(list);
        System.out.println(strings);
    }
}
