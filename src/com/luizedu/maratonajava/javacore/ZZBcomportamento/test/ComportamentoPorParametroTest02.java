package com.luizedu.maratonajava.javacore.ZZBcomportamento.test;

import com.luizedu.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import com.luizedu.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    private final static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );


    public static void main(String[] args) {
        List<Car> greenCars = filterWithPredicate(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filterWithPredicate(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCars = filterWithPredicate(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterWithPredicate(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

}
