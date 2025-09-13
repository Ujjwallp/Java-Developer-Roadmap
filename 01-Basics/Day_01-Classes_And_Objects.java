public class Day_01_Classes_And_Objects {

    String color;   // Non-static property (Object-Level)
    int speed;      // Non-static property (Object-Level)

    public static String builder = "Modern Builders"; // Static property (Class-Level)

    void drive() {
        System.out.println("Car is driving...");
    }

    void startEngine() {
        System.out.println("Engine started for: " + this.color);
    }

    public static void main(String[] args) {

        // Creating objects using 'new' keyword
        Day_01_Classes_And_Objects car1 = new Day_01_Classes_And_Objects();
        car1.color = "Red";
        car1.speed = 100;

        Day_01_Classes_And_Objects car2 = new Day_01_Classes_And_Objects();
        car2.color = "Blue";
        car2.speed = 120;

        // Access non-static via objects
        System.out.println("Car1 Color: " + car1.color);
        System.out.println("Car2 Color: " + car2.color);

        // Access static directly via class
        System.out.println("Builder: " + Day_01_Classes_And_Objects.builder);

        // Call non-static method via object
        car1.startEngine();
    }
}