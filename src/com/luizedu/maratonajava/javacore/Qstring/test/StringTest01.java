package com.luizedu.maratonajava.javacore.Qstring.test;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {

        String nome = "William";
        String nome2 = "William";
        nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome2);
        nome = nome.concat(" Suane");
        System.out.println(nome.equals(nome2));
        System.out.println(nome == nome2);

        String nome3 = new String("William");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

        String test = new Scanner(System.in).nextLine();
        String test2 = new Scanner(System.in).nextLine();
        System.out.println(test == test2);
    }
}
