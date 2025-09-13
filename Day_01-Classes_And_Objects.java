// Day 01 - Classes and Objects

class Car {
    String color;   // property
    int speed;      // property

    void drive() {  // action
        System.out.println("Car is driving...");
    }

    // TODO: Q3 - Add a non-static method startEngine() that prints brand
}

public class Day_01_Classes_And_Objects {
    // Static variable (class-level)
    public static String builder = "Modern Builders";

    public static void main(String[] args) {
        // Creating objects using new keyword
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "Red";
        car1.speed = 120;

        car2.color = "Blue";
        car2.speed = 100;

        System.out.println("Car1 is " + car1.color + " with speed " + car1.speed);
        System.out.println("Car2 is " + car2.color + " with speed " + car2.speed);

        System.out.println("Builder: " + builder);

        // ---------------- PRACTICE QUESTIONS ----------------
        // Q1. Create a Car class with brand and year. Print details.
        // TODO: Solve here

        // Q2. Add static variable totalCarsCreated. Increment on object creation.
        // TODO: Solve here

        // Q3. Call non-static startEngine() method correctly.
        // TODO: Solve here
    }
}
