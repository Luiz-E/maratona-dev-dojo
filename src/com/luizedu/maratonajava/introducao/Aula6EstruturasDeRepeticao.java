package com.luizedu.maratonajava.introducao;

public class Aula6EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for

        int count = 12;

        while (count <= 10) {
            System.out.println(count++);
        }

        do {
            System.out.println("Dentro do dowhile " + count);
        } while (count <= 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }

    }
}
