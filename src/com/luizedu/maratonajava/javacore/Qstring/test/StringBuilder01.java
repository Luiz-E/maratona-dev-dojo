package com.luizedu.maratonajava.javacore.Qstring.test;

public class StringBuilder01 {

    public static void main(String[] args) {

        String nome = "William Suane";
        nome.concat(" DevDojo");

        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.substring(0,2);
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);

    }

}
