package com.luizedu.maratonajava.javacore.Oexception.exception.test;

import com.luizedu.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDb = "Goku";
        String senhaDb = "ssj";

        System.out.println("Usuário: ");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = sc.nextLine();

        if (!usernameDb.equals(usernameDigitado) || !senhaDb.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválido");
        }

        System.out.println("Usuário logado");

    }
}
