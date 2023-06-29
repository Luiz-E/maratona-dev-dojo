package com.luizedu.maratonajava.javacore.Zgenerics.test;

import com.luizedu.maratonajava.javacore.Zgenerics.domain.Carro;
import com.luizedu.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.retrieveAvailableCar();
        System.out.println("Usando carro por um mês..");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
