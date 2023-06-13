package com.luizedu.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade (int idade) {
        if (idade < 0) {
            System.out.println("Idade Inv�lida");
            return;
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

}
