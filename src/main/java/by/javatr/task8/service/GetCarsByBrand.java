package by.javatr.task8.service;

import by.javatr.task8.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class GetCarsByBrand {
    public static ArrayList<Car> getCarsByBrand(ArrayList<Car> cars, Brand brand) {
        ArrayList<Car> result = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand))
                result.add(car);
        }
        return result;
    }
}
