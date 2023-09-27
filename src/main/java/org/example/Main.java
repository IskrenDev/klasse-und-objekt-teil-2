package org.example;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Audi", "A8", 2021);
        Car car1 = new Car("Porsche", "Cayenne", 2014, 4);
        Car car2 = new Car("Ente", "s876", 1799, 3);
        Motorbike motorbike1 = new Motorbike("Chopper");

        System.out.println(vehicle1);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(motorbike1);
    }
}