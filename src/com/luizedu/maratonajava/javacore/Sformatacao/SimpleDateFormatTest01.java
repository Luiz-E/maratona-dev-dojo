package com.luizedu.maratonajava.javacore.Sformatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {

        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern2);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Brasil 08 de maio de 2023"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
