Code Example
Java

// This is our blueprint (Class) for a House
class House {
    // This is a non-static variable. It belongs to an individual object.
    String color;
    int numberOfRooms;

    // This is a static variable. It belongs to the class itself.
    public static String builder = "Modern Builders";

    public static void main(String[] args) {
        // ERROR: This will not work! The 'color' variable belongs to a house that doesn't exist yet.
        // System.out.println(color); 

        // CORRECT WAY: First, create a House object using the 'new' keyword.
        House myHouse = new House();
        myHouse.color = "Red";
        myHouse.numberOfRooms = 3;

        House yourHouse = new House();
        yourHouse.color = "Blue";
        yourHouse.numberOfRooms = 4;

        // Now you can access the non-static variable through the object.
        System.out.println("My house is " + myHouse.color);
        System.out.println("Your house is " + yourHouse.color);

        // You can access the static variable directly using the class name.
        System.out.println("The builder is " + House.builder);
    }
}
5. Practice Questions
Level 1: The Blueprint

Task: Create a Car class. Give it two non-static variables: String brand and int year. In your main method, create a new Car object, give it a brand and year, and print them.

Level 2: The Shared Property

Task: Add a static variable int totalCarsCreated to your Car class. In your main method, create three different Car objects. After creating each one, increase the value of totalCarsCreated. Print the final value to show it's shared.

Level 3: The Rule Breaker

Task: The main method is static. Can you write a non-static method inside your Car class called startEngine() that prints the car's brand? Now, can you call that startEngine() method directly from the main method? If not, why? Write the correct code to call it.

