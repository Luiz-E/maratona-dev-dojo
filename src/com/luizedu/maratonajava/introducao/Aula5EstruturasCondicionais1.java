package com.luizedu.maratonajava.introducao;

public class Aula5EstruturasCondicionais1 {
    public static void main(String[] args) {
//        if (false) {
//            System.out.println("Dentro do IF");
//        }
//        System.out.println("Fora do IF");

        int age = 20;
        boolean isAbleToBuyDrinks = age > 18;
        if (isAbleToBuyDrinks) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        System.out.println(age<18?"Age under 18":"age over 18");
    }
}
