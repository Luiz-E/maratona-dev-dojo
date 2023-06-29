package com.luizedu.maratonajava.javacore.Zgenerics.test;

import com.luizedu.maratonajava.javacore.Zgenerics.domain.Barco;
import com.luizedu.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mês..");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
