package com.luizedu.maratonajava.javacore.Hherança.test;

import com.luizedu.maratonajava.javacore.Hherança.dominio.Endereco;
import com.luizedu.maratonajava.javacore.Hherança.dominio.Funcionario;
import com.luizedu.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("11111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("-------------------------");
        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("22222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20_000);
        funcionario.imprime();

        funcionario.relatorioPagamento();
    }
}
