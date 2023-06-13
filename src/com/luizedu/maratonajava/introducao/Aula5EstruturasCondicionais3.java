package com.luizedu.maratonajava.introducao;

public class Aula5EstruturasCondicionais3 {
    public static void main(String[] args) {
        double salary = 6000.0;
        String willDonateMessage = "Eu vou doar 500 pro DevDojo";
        String wontDonateMessage = "Ainda não tenho condições, mas vou ter!";
        String result = (salary > 5000) ? willDonateMessage : wontDonateMessage ;

        System.out.println(result);

    }
}
