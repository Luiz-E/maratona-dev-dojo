package com.luizedu.maratonajava.introducao;

import java.util.Scanner;

public class Aula5EstruturasCondicionais4 {
    public static void main(String[] args) {
        // Dado um sal�rio, quanto de imposto cair� sobre o indiv�duo
        // Dados de 2020 - Holanda

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu sal�rio?");
        double salary = sc.nextDouble();

        double firstTaxBracket = 9.7 / 100;
        double secondTaxBracket = 37.35 / 100;
        double thirdTaxBracket = 49.5 / 100;
        double tax, valueTax;

        if (salary >= 0 && salary <= 34712) {
            tax = firstTaxBracket;
        } else if (salary > 34712 && salary < 68507) {
            tax = secondTaxBracket;
        } else {
            tax = thirdTaxBracket;
        }

        System.out.println("Tax: " + (salary * tax));

    }
}
