package com.luizedu.maratonajava.javacore.Gassociacao.test;

import com.luizedu.maratonajava.javacore.Gassociacao.dominio.Jogador;
import com.luizedu.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(new Jogador[]{jogador, jogador2});

        System.out.println("-- Jogador --");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("-- Time --");
        time.imprime();
    }
}
