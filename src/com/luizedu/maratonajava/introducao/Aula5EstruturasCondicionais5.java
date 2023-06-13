package com.luizedu.maratonajava.introducao;

public class Aula5EstruturasCondicionais5 {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando 1 como domingo

        byte day = 5;
        String weekDay;

        switch (day) {
            case 1:
                weekDay = "Sunday";
                break;
            case 2:
                weekDay = "Monday";
                break;
            case 3:
                weekDay = "Tuesday";
                break;
            case 4:
                weekDay = "Wednesday";
                break;
            case 5:
                weekDay = "Thursday";
                break;
            case 6:
                weekDay = "Friday";
                break;
            case 7:
                weekDay = "Saturday";
                break;
            default:
                weekDay = "Opção inválida";
        }

        System.out.println(weekDay);

        char gender = 'M';
        switch (gender) {
            case 'M':
                System.out.println("Masculino");
            case 'F':
                System.out.println("Feminino");
            default:
                System.out.println("Opção inválida");
        }

    }
}
