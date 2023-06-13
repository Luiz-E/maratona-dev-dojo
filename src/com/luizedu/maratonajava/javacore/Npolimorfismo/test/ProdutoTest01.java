package com.luizedu.maratonajava.javacore.Npolimorfismo.test;

import com.luizedu.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.luizedu.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.luizedu.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.luizedu.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Saladete", 10);

//        CalculadoraImposto.calcularImpostoComputador(computador);
//        System.out.println("---------------------------");
//        CalculadoraImposto.calcularImpostoTomate(tomate);

    }

}
