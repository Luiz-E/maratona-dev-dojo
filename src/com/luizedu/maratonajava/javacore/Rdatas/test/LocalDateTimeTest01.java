package com.luizedu.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.of(9, 45, 21);
        time = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println(localDateTime1);

    }
}
