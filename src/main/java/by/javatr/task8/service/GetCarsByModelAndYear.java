package by.javatr.task8.service;

import by.javatr.task8.entity.Car;

import java.util.ArrayList;

public class GetCarsByModelAndYear {
    public static ArrayList<Car> getCarsByModelAndYear(ArrayList<Car> cars, String model, int yearsOfExploitation) {
        ArrayList<Car> result = new ArrayList<Car>();
        for(Car car : cars) {
            if (car.getModel().equals(model) && (GetCurrentYear.getCurrentYear() - car.getYearOfIssue()) > yearsOfExploitation)
                result.add(car);
        }
        return result;
    }
}
