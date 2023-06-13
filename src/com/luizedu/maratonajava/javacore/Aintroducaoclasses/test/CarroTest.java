package com.luizedu.maratonajava.javacore.Aintroducaoclasses.test;

import com.luizedu.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "nome do carro";
        carro.modelo = "modelo do carro";
        carro.ano = 2001;
        
        Carro carro2 = new Carro();
        carro2.nome = "nome do carro2";
        carro2.modelo = "modelo do carro2";
        carro2.ano = 2013;

        System.out.printf("Nome do carro: %s\nModelo do carro: %s\nAno do carro: %d\n", carro.nome, carro.modelo, carro.ano);
        System.out.println("---------------------------");
        System.out.printf("Nome do carro: %s\nModelo do carro: %s\nAno do carro: %d", carro2.nome, carro2.modelo, carro2.ano);

    }
}
