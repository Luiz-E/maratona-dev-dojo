package com.luizedu.maratonajava.javacore.Oexception.exception.test;

import com.luizedu.maratonajava.javacore.Oexception.exception.domain.Funcionario;
import com.luizedu.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;
import com.luizedu.maratonajava.javacore.Oexception.exception.domain.Pessoa;

public class SobrescritaComExceptionTest01 {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

}
