package com.luizedu.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {

    public static void main(String[] args) {
        try {
            recursividade();
        } catch (Error ex) {
            System.out.println("é");
        }
    }

    public static void recursividade() {
        recursividade();
    }

}
