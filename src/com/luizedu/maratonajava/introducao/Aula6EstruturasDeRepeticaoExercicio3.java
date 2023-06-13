package com.luizedu.maratonajava.introducao;

public class Aula6EstruturasDeRepeticaoExercicio3 {
    public static void main(String[] args) {
         double valorParcela = 1000;
         double valorCarro = 30000;
         for (int i = 2; i < valorCarro; i++) {
            if ((valorCarro / i) < valorParcela) {
                break;
            }
             System.out.printf("Número de parcelas: %d \nValor da Parcela: R$%.2f\n", i, (valorCarro / i));
         }
    }
}
