package com.luizedu.maratonajava.javacore.Zgenerics.test;

import com.luizedu.maratonajava.javacore.Zgenerics.domain.Barco;
import com.luizedu.maratonajava.javacore.Zgenerics.domain.Carro;
import com.luizedu.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import com.luizedu.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês..");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("-------------------------------------");

        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando barco por um mês..");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
