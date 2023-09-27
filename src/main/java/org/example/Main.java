package org.example;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Audi", "A8", 2021);
        Car car1 = new Car("Porsche", "Cayenne", 2014, 4);

        System.out.println(vehicle1);
        System.out.println(car1);
    }
}