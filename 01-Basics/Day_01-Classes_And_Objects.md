[⬅ Back to README](../README.md)

# Day 01 – Classes and Objects

---

## Table of Contents
1. [The Blueprint: What is a Class?](#the-blueprint-what-is-a-class)
2. [The Real Thing: What is an Object?](#the-real-thing-what-is-an-object)
3. [The Builder: The new Keyword](#the-builder-the-new-keyword)
4. [static vs. non-static: The Golden Rule](#static-vs-non-static-the-golden-rule)
5. [The Fundamental Rule](#the-fundamental-rule)
6. [Practice Questions](#practice-questions)
7. [Daily Tip](#daily-tip)
8. [References](#references)

---

## The Blueprint: What is a Class?
Think of a **Class** as a blueprint or template. It helps us create objects.

Real-Life Example:
A house blueprint shows layout, but you can’t live in it.

In Java:
```java
class Car {
    String color;   // property
    int speed;      // property

    void drive() {  // action
        System.out.println("Car is driving...");
    }
}
```

---

## The Real Thing: What is an Object?
An object is the real house built from the blueprint and stored in memory.

In Java:
```java
Car car1 = new Car();   // First Object
Car car2 = new Car();   // Second Object
```

---

## The Builder: The new Keyword
The `new` keyword creates an object from a class blueprint.

Example:
```java
Car car1 = new Car();
```

---

## static vs. non-static: The Golden Rule

### Non-static (object-level)
- Belongs to individual objects.
Example:
```java
String color;
```

### static (class-level)
- Belongs to the class itself; shared by all instances.
Example:
```java
public static String builder = "Modern Builders";
```

---

## The Fundamental Rule
- `static` exists at class level; non-static exists per object.
- Static cannot access non-static directly; create an object first.

---

## Practice Questions
1. Create a `Car` class with properties `brand` and `year`. Create one object and print its details.
2. Add a static variable `totalCarsCreated` in the `Car` class. Increment it whenever a new object is created. Create 3 objects and print total.
3. Write a non-static method `startEngine()` that prints the car's brand. Show correct way to call it from `main`.

(Links to solutions: in the same folder `Day_01-Classes_And_Objects.java`)

---

## Daily Tip
Whenever confused about static vs non-static ask: "Does this belong to the blueprint (class) or to a house (object)?"

---

## References
- Variables
- Constructors
- Class & Object
