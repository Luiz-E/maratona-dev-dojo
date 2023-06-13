package com.luizedu.maratonajava.introducao;

import java.util.Scanner;

public class Aula6EstruturasDeRepeticaoExercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxValue = 50;

        for (int i = 0, j = 0; i <= maxValue ; i++, j++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }

        sc.close();
    }
}
