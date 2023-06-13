package com.luizedu.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {

        try {
            System.out.println(divisao(1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b não pode ser zero");
        }
        return a / b;
    }

}
