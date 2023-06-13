package com.luizedu.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String
    toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
