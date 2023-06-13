package com.luizedu.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTeclado02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = sc.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
