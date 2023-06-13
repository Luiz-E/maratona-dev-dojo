package com.luizedu.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d -> Todos os dígitos
        // \D -> Tudo o que não for dígito
        // \s -> espaços em branco \t \n \f \r
        // \S -> todos os caracteres excluindo brancos
        // \w -> a-zA-z, dígitos, _
        // \W -> tudo que não for incluso no \w
        // []

//        String regex = "aba";
//        String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";

//        String text = "abaaba";
//        String text2 = "abababa";
//        String text3 = "@#hh_j2 12gvh21";
//        String text4 = "cafeBABE";

        String text5 = "12 0x 0x 0xFFABC 0x109 0x1";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text5);
        System.out.println("texto:  " + text5);
        System.out.println("indíce: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }
    }
}
