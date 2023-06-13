package com.luizedu.maratonajava.introducao;

public class Aula4Operadores {
    public static void main(String[] args) {

        //ARITMÉTICOS

        int numero01 = 10;
        int numero02 = 20;

        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Subtração: " + (numero01 - numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));
        System.out.println("Divisão: " + ((double)numero01 / numero02));
        System.out.println("Resto: " + (10%3));

        //RELACIONAIS: < > <= >= == !=

        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenEqualTwenty = 10 == 20;
        boolean isTenDifferentOfTwenty = 10 != 20;

        System.out.println("isTenBiggerThanTwenty:"+isTenBiggerThanTwenty);
        System.out.println("isTenSmallerThanTwenty:"+isTenSmallerThanTwenty);
        System.out.println("isTenEqualTwenty:"+isTenEqualTwenty);
        System.out.println("isTenDifferentOfTwenty:"+isTenDifferentOfTwenty);

        //LÓGICOS: && || !

        int age = 35;
        age = 29;
        float salary = 3500F;

        boolean isWithinTheLawWhenAgeBiggerThanThirty = age >= 30 && salary > 4612;
        boolean isWithinTheLawWhenAgeLessThanThirty = age < 30 && salary >= 3381;

        System.out.println("Am I within the law with age bigger than thirty: " + isWithinTheLawWhenAgeBiggerThanThirty);
        System.out.println("isWithinTheLawWhenAgeLessThanThirty: " + isWithinTheLawWhenAgeLessThanThirty);

        double totalCurrentAccount = 200;
        double totalSavingAccount = 10000;
        float playstationPrice = 5000F;

        boolean isPlaystationFivePurchasable = totalCurrentAccount > playstationPrice || totalSavingAccount > playstationPrice;
        System.out.println("isPlaystationFivePurchasable: "+isPlaystationFivePurchasable);

        // OPERADORES DE ATRIBUIÇÃO = += -= *= /= %=

        double bonus = 1800;
        //bonus = bonus + 1000;
        bonus += 1000;
        bonus -= 300;
        bonus *= 2;
        bonus /= 1.25;

        System.out.println(bonus);

        int contador = 0;

        contador++;
        contador--;
        System.out.println(contador);
        System.out.println(++contador);
        System.out.println(contador++);
        System.out.println(contador);
        System.out.println(--contador);
        System.out.println(contador--);
        System.out.println(contador);
    }
}
