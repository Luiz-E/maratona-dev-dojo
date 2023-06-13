package com.luizedu.maratonajava.javacore.Npolimorfismo.servico;

import com.luizedu.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.luizedu.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.luizedu.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relat�rio de imposto do computador: ");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador: " + computador.getNome());
//        System.out.println("Valor: " + computador.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relat�rio de imposto do tomate: ");
//        double imposto = tomate.calcularImposto();
//        System.out.println("tomate: " + tomate.getNome());
//        System.out.println("Valor: " + tomate.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//    }

    public static void calcularImposto(Produto produto) {
        System.out.println("Relat�rio de imposto: ");
        double imposto = produto.calcularImposto();
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Tomate) {
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }

}
