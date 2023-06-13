package com.luizedu.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimirDados() {

        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Idade: %d\n", this.idade);

        if (salarios == null) {
            return;
        }

        System.out.printf("Salários: ");
        for (double salario : salarios) {
            System.out.printf("%.2f\t ", salario);
        }
        imprimeMedia();
    }
    public void imprimeMedia() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += (salario / salarios.length);
        }
        System.out.printf("Média salarial: %.2f\n", media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
