package com.luizedu.maratonajava.javacore.Gassociacao.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, Seminario seminario) {
        this.nome = nome;
        this.seminario = seminario;
    }

    public Estudante(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }
}
