1. The Blueprint: What is a Class?
Think of a class as a blueprint or a template. It's a design, an idea, not a real, physical thing.

Example from life: A blueprint for a house. It shows the number of rooms, the color of the walls, and the layout, but you can't live in the blueprint itself. It’s just the plan.

In Java: A class defines the properties (variables) and the actions (methods) that all objects created from it will have. For example, a Car class defines that every car will have a color and a speed.

2. The Real Thing: What is an Object?
An object is a real thing that is made from the class blueprint. It's a physical instance that exists in the computer's memory.

Example from life: The actual house built from the blueprint. It has a specific color, a specific number of rooms, and you can live in it.

In Java: An object is an instance of a class. You can create many different objects from the same class. Each object has its own unique set of properties.

3. The Builder: The new Keyword
The new keyword is the builder. It's the command that tells Java, "Please create a new object from this class."

Example from life: The builder who takes the blueprint and constructs the real house.

In Java: When you write new Car(), you are instructing Java to use the Car blueprint and create a new, real Car object in the computer's memory.

4. static vs. non-static: The Golden Rule
This is a concept that confuses many beginners, but once you understand the simple logic, it will make perfect sense.

non-static (Object-Level): These are properties that belong to the individual object. Each object has its own unique copy.

Analogy: The color of the house. One house is red, another is blue. The color belongs to each specific house.

In Code: A non-static variable is declared inside a class but without the static keyword. For example, String color;.

static (Class-Level): These are properties that belong to the blueprint itself, not the individual objects. There is only one copy of this information, which is shared by all objects of that class.

Analogy: The architect's name on the blueprint. The architect's name is the same for every house built from that specific blueprint.

In Code: A static variable is declared using the static keyword. For example, public static String architectName = "Raj";.

The Fundamental Rule: Why static cannot access non-static
This is the most common error for beginners.

A static method, like the main method, belongs to the blueprint (class). It exists before any real objects (houses) are created.

A non-static variable, like color, belongs to a specific object (house). It only exists after you use the new keyword to create it.

Therefore, the static method cannot access the non-static variable directly because the non-static variable might not even exist yet!

You must first create an object using new, and then access the non-static variable through that object.
