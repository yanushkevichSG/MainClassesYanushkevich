package by.javatr.task8.entity;

import by.javatr.task8.service.Brand;
import by.javatr.task8.service.Color;
import by.javatr.task8.service.Model;


public class Car {
    private int id;
    private Brand brand;
    private String model;
    private int yearOfIssue;
    private Color color;
    private double price;
    private String regNumber;
    private static int counter = 1;

    public Car(Brand brand, String model, int yearOfIssue, Color color, double price, String regNumber) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
        id = counter++;
    }

    public Car(String model, int yearOfIssue, Color color, double price, String regNumber) {
        this.brand = Brand.CITROEN;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
        id = counter++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", color=" + color +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (yearOfIssue != car.yearOfIssue) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (brand != car.brand) return false;
        if (!model.equals(car.model)) return false;
        if (color != car.color) return false;
        return regNumber.equals(car.regNumber);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + yearOfIssue;
        result = 31 * result + color.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + regNumber.hashCode();
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

}
