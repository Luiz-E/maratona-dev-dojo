package com.luizedu.maratonajava.javacore.ZZAclassesinternas.test;

import com.luizedu.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNameComparator implements Comparator<Barco> {

    @Override
    public int compare(Barco barco, Barco t1) {
        return barco.getNome().compareTo(t1.getNome());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
//        barcoList.sort(new BarcoNameComparator());
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco barco, Barco t1) {
                return barco.getNome().compareTo(t1.getNome());
            }
        });
        System.out.println(barcoList);
    }
}
