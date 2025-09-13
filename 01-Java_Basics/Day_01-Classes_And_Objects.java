// Day 01 – Classes and Objects

class Car {
    String color;   // non-static property
    int speed;      // non-static property
    static String builder = "Modern Builders"; // static property

    void drive() {
        System.out.println("Car is driving...");
    }

    void startEngine() {
        System.out.println("Engine started for " + color + " car");
    }
}

public class Day_01_Classes_And_Objects {
    public static void main(String[] args) {
        // Example objects
        Car car1 = new Car();
        car1.color = "Red";
        car1.speed = 100;

        Car car2 = new Car();
        car2.color = "Blue";
        car2.speed = 120;

        System.out.println("Car1 color: " + car1.color);
        System.out.println("Car2 color: " + car2.color);
        System.out.println("Builder: " + Car.builder);

        car1.startEngine();

        /* ---------------- PRACTICE QUESTIONS ----------------
        
        <a name="q1"></a>
        Q1. Create a Car class with properties brand and year. 
            Create one object and print its details.
        TODO: Write your solution here.
        // 🔗 Back to Notes: Day_01-Classes_And_Objects.md#q1

        <a name="q2"></a>
        Q2. Add a static variable totalCarsCreated in the Car class. 
            Increment it every time a new object is created. 
            Print the total after creating 3 objects.
        TODO: Write your solution here.
        // 🔗 Back to Notes: Day_01-Classes_And_Objects.md#q2

        <a name="q3"></a>
        Q3. Write a non-static method startEngine() that prints the car's brand. 
            Can you call it directly from main()? If not, why? Fix the code.
        TODO: Write your solution here.
        // 🔗 Back to Notes: Day_01-Classes_And_Objects.md#q3

        ------------------------------------------------------ */
    }
}
