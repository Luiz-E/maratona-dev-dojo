package com.luizedu.maratonajava.javacore.Gassociacao.test;

import com.luizedu.maratonajava.javacore.Gassociacao.dominio.Escola;
import com.luizedu.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Escola escola = new Escola("Konoha", new Professor[]{professor1, professor2});
        escola.imprime();
    }
}
