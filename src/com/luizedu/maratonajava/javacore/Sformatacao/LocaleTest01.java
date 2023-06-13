package com.luizedu.maratonajava.javacore.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        Locale localeItaly = new Locale("it", "IT");
        Locale localeCh = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar c = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCh);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);


        System.out.println(df1.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));
        System.out.println(df3.format(c.getTime()));
        System.out.println(df4.format(c.getTime()));
        System.out.println(df5.format(c.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCh.getDisplayCountry());
        System.out.println(localeJapao.getDisplayCountry());
        System.out.println(localeIndia.getDisplayCountry());

        System.out.println(localeHolanda.getDisplayCountry(localeItaly));

        System.out.println(localeHolanda.getDisplayLanguage());
        System.out.println(localeHolanda.getDisplayLanguage(localeCh));
    }
}
