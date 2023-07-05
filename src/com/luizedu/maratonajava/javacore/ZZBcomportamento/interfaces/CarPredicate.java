package com.luizedu.maratonajava.javacore.ZZBcomportamento.interfaces;

import com.luizedu.maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
