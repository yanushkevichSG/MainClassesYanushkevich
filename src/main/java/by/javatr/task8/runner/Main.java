package by.javatr.task8.runner;

import by.javatr.task8.entity.Car;
import by.javatr.task8.service.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car> (Arrays.asList(
                new Car(Brand.BMW, "X5M", 2005, Color.BLACK, 10005.23, "asda"),
                new Car(Brand.BMW, "E32", 2004, Color.BLACK, 102005.23, "AEAD"),
                new Car(Brand.MAZDA, "CX7", 2010, Color.BLACK, 11235.23, "ADSD"),
                new Car(Brand.CITROEN, "C5", 2010, Color.BLACK, 11235.23, "4743 CX-7"),
                new Car(Brand.CITROEN, "C5", 2004, Color.BLACK, 5000, "4743 CX-7")
        ));
        ArrayList<Car> cars1 = GetCarsByBrand.getCarsByBrand(cars, Brand.MAZDA);
        OutputList.outputCarList(cars1);
        ArrayList<Car> cars2 = GetCarsByModelAndYear.getCarsByModelAndYear(cars, "C5", 9);
        OutputList.outputCarList(cars2);
        ArrayList<Car> cars3 = GetCarsByYearAndPrice.getCarsByYearAndPrice(cars, 2004, 4999);
        OutputList.outputCarList(cars3);

    }
}
