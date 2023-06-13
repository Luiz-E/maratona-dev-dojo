package com.luizedu.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusters {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

//        LocalDate date = LocalDate.now();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
//
//        for (int i = 1; i <= 7; i++) {
//            System.out.println("Date: " + date.format(dtf));
//            System.out.println("Day of week: " + date.getDayOfWeek());
//            System.out.println("Next work day: " + getNextWorkDay(date));
//            date = date.plusDays(1);
//        }


    }

//    public static DayOfWeek getNextWorkDay(LocalDate date) {
//
//        switch (date.getDayOfWeek()) {
//            case FRIDAY:
//            case SATURDAY:
//            case SUNDAY:
//                return DayOfWeek.MONDAY;
//            default:
//                return date.plusDays(1).getDayOfWeek();
//        }
//    }
}
