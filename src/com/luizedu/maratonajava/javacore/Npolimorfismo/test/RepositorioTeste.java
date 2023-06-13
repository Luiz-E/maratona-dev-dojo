package com.luizedu.maratonajava.javacore.Npolimorfismo.test;

import com.luizedu.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import com.luizedu.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import com.luizedu.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import com.luizedu.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {

    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio = new RepositorioArquivo();
        repositorio = new RepositorioMemoria();

        repositorio.salvar();

    }

}
