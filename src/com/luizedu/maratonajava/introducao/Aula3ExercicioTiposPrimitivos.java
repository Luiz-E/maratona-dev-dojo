package com.luizedu.maratonajava.introducao;

    /*

        Pr�tica

        Crie vari�veis para os campos descritos abaixo entre <> e imprima a seguinte mensagem

        Eu <nome>, morando no endere�o <endere�o>,
        confirmo que recebi o sal�rio de <sal�rio>, na data <data>

    */

public class Aula3ExercicioTiposPrimitivos {

    public static void main(String[] args) {
        String nome = "Luiz", endereco = "MJS", dataRecebimentoSalario = "2/12/2023";
        double salario = 2300;
        String relatorio = "Eu, "+nome+", morando no endere�o "+endereco+", \nconfirmo que recebi o sal�rio de R$"+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);

    }

}
