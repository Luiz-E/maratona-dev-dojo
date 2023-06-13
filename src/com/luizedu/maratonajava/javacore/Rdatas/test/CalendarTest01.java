package com.luizedu.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest01 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2);
        c.add(Calendar.HOUR, 2);
        Date date = c.getTime();
        System.out.println(date);
    }
}
