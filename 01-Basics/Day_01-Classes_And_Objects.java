// Day 01 - Classes and Objects (Example + TODOs)

class Car {
    String color;   // property
    int speed;      // property

    // Practice variables (Q1)
    String brand;
    int year;

    // Non-static method (action)
    void drive() {
        System.out.println("Car is driving...");
    }

    // Q3 TODO method placeholder
    void startEngine() {
        System.out.println(brand + " engine started!");
    }
}

public class Day_01_Classes_And_Objects {
    // Static variable (class-level) - example for Q2
    public static int totalCarsCreated = 0;

    public static void main(String[] args) {
        // Creating objects using new keyword
        Car car1 = new Car();
        totalCarsCreated++;
        car1.color = "Red";
        car1.speed = 120;
        car1.brand = "Toyota";
        car1.year = 2020;

        Car car2 = new Car();
        totalCarsCreated++;
        car2.color = "Blue";
        car2.speed = 100;
        car2.brand = "Honda";
        car2.year = 2021;

        // Accessing fields and methods
        System.out.println("Car1 is " + car1.color + " with speed " + car1.speed);
        System.out.println("Car2 is " + car2.color + " with speed " + car2.speed);

        System.out.println("Builder: Modern Builders");

        car1.drive();
        car2.drive();

        // TODO: Q1 implementation area
        // TODO: Q2 implementation area (use totalCarsCreated)
        // TODO: Q3 implementation area (use startEngine())
    }
}
