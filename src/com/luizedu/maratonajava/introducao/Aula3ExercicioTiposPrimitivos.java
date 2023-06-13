package com.luizedu.maratonajava.introducao;

    /*

        Prática

        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem

        Eu <nome>, morando no endereço <endereço>,
        confirmo que recebi o salário de <salário>, na data <data>

    */

public class Aula3ExercicioTiposPrimitivos {

    public static void main(String[] args) {
        String nome = "Luiz", endereco = "MJS", dataRecebimentoSalario = "2/12/2023";
        double salario = 2300;
        String relatorio = "Eu, "+nome+", morando no endereço "+endereco+", \nconfirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);

    }

}
