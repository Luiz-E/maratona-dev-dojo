package com.luizedu.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner sc = new Scanner(texto);
        sc.useDelimiter(",");
        while(sc.hasNext()) {
            if (sc.hasNextInt()) {
                System.out.println(sc.nextInt());
            } else if (sc.hasNextBoolean()) {
                System.out.println(sc.nextBoolean());
            } else {
                System.out.println(sc.next());
            }
        }
    }
}
