package com.luizedu.maratonajava.introducao;

// CTRL SHIFT F10

public class Aula2TiposPrimitivos {
    public static void main(String[] args) {

        //INTRODU��O

        //int, double, float, char, byte, short, long, boolean
        int age = 10;
        long bigNumber = 100000L;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean iWillFinishThisCourse = true;
        char gender = 'M';
        char character = 65;

        System.out.println("A idade � " + age);
        System.out.println(iWillFinishThisCourse);
        System.out.println(character);

        // CASTING

        age = (int) 10000000000000000L;
        bigNumber = (long) 203.54;
        System.out.println(age);
        System.out.println(bigNumber);

        //STRINGS
        // String � um tipo de refer�ncia

        String texto = "� um texto";
        System.out.println(texto);
    }
}
