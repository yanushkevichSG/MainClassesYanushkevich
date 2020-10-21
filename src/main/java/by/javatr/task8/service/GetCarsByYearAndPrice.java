package by.javatr.task8.service;

import by.javatr.task8.entity.Car;

import java.util.ArrayList;

public class GetCarsByYearAndPrice {
    public static ArrayList<Car> getCarsByYearAndPrice(ArrayList<Car> cars, int yearOfIssue, double price) {
        ArrayList<Car> result = new ArrayList<Car>();
        for(Car car : cars) {
            if ((car.getYearOfIssue() == (yearOfIssue)) && (car.getPrice() > price))
                result.add(car);
        }
        return result;
    }
}
