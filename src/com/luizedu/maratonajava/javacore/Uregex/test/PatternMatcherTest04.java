package com.luizedu.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d -> Todos os d�gitos
        // \D -> Tudo o que n�o for d�gito
        // \s -> espa�os em branco \t \n \f \r
        // \S -> todos os caracteres excluindo brancos
        // \w -> a-zA-z, d�gitos, _
        // \W -> tudo que n�o for incluso no \w
        // []
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n, m} de n at� m
        // ()
        // |
        // $

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0x 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("texto:  " + text);
        System.out.println("ind�ce: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posi��es encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }
    }
}
