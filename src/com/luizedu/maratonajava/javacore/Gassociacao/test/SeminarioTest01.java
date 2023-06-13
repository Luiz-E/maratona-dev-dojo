package com.luizedu.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;
        do {
            System.out.println("1 - Cadastrar seminário;");
            System.out.println("2 - Cadastrar professor;");
            System.out.println("3 - Cadastrar aluno;");
            System.out.println("4 - Finalizar;");
            option = sc.next().charAt(0);
            switch (option) {
                case '1':
                    cadastrarSeminario();
                    break;
                case '2':
                    cadastrarProfessor();
                    break;
                case '3':
                    cadastrarAluno();
                    break;
            }
        } while (option != 4);
    }

    private static void cadastrarProfessor() {
    }

    private static void cadastrarAluno() {
    }

    private static void cadastrarSeminario() {
    }
}
