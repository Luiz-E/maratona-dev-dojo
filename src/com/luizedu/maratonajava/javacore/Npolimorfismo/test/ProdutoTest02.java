package com.luizedu.maratonajava.javacore.Npolimorfismo.test;

import com.luizedu.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.luizedu.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.luizedu.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import com.luizedu.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.luizedu.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {

    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);
//        System.out.println(produto.getNome());
//        System.out.println(produto.getValor());
//        System.out.println(produto.calcularImposto());

//        System.out.println("----------------");
        Produto produto2 = new Tomate("Tomate Americano", 20);
//        System.out.println(produto2.getNome());
//        System.out.println(produto2.getValor());
//        System.out.println(produto2.calcularImposto());


        Televisao tv = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(produto);
        CalculadoraImposto.calcularImposto(produto2);
        CalculadoraImposto.calcularImposto(tv);
    }

}
