package com.luizedu.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "William Suane";
    static class Nested {
        void print() {
            System.out.println(new OuterClassesTest03().name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
