package com.luizedu.maratonajava.introducao;

public class Aula5EstruturasCondicionais6 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte day = 1;
        String type;
        switch (day) {
            case 1:
            case 7:
                type = "Final de Semana";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                type = "Dia útil";
                break;
            default:
                type = "Dia inválido";
        }

        System.out.println(type);
    }
}
