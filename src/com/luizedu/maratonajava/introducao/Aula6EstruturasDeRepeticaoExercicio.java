package com.luizedu.maratonajava.introducao;

public class Aula6EstruturasDeRepeticaoExercicio {
    public static void main(String[] args) {
        // Imprimir todos os números pares de 0 a 1.000.000
        for (int i = 0; i <= 1_000_000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
