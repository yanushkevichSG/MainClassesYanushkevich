package by.javatr.task8.service;

import by.javatr.task8.entity.Car;

import java.util.ArrayList;

public class OutputList {
    public static void outputCarList(ArrayList<Car> cars) {
        for(Car elem : cars) {
            System.out.println(elem.toString());
        }
    }
}
