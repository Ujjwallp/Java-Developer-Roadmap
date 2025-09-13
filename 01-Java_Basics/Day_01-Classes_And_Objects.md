# 📘 Day 01 – Classes and Objects  

---

## 📑 Table of Contents  
1. [The Blueprint: What is a Class?](#-the-blueprint-what-is-a-class)  
2. [The Real Thing: What is an Object?](#-the-real-thing-what-is-an-object)  
3. [The Builder: The new Keyword](#-the-builder-the-new-keyword)  
4. [static vs. non-static: The Golden Rule](#%EF%B8%8F-static-vs-non-static-the-golden-rule)  
5. [The Fundamental Rule](#-fundamental-rule)  
6. [Code Example](#-code-example)  
7. [Practice Questions](#-practice-questions)  
8. [Daily Tip](#-daily-tip)  
9. [AI Memory Hacks](#-ai-memory-hacks)  
10. [Solutions](#-solutions)  
11. [References](#-references)  

---

## 🏗️ The Blueprint: What is a Class?  
Think of a **Class** as a **blueprint or template**.  
It helps us create **Objects**.  

💭 **Real-Life Example**:  
A **house blueprint** → shows layout, but you can’t live in it.  

💻 **In Java**:  
A class defines:  
- **Properties** → Variables  
- **Actions** → Methods  

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

## 🚗 The Real Thing: What is an Object?  
An **Object** is the real house built from the blueprint.  
It is stored in memory with its own values.  

💭 **Real-Life Example**:  
A real house → has a specific color, rooms, and you can live in it.  

💻 **In Java**:  
An object is an instance of a class.  

```java
Car car1 = new Car();   // First Object
Car car2 = new Car();   // Second Object
```

---

## 👷 The Builder: The new Keyword  
The `new` keyword is like a builder.  
It creates an Object from a Class blueprint.  

```java
Car car1 = new Car();
```

---

## ⚖️ static vs. non-static: The Golden Rule  

### 🔴 Non-static (Object-Level)  
- Belongs to individual objects.  
- Each object has its own unique copy.  

💭 **Example**: One house is red, another is blue → color belongs to each house.  

```java
String color;
```

---

### 🔵 static (Class-Level)  
- Belongs to the class blueprint itself.  
- Only one copy exists, shared by all objects.  

💭 **Example**: The architect’s name on the blueprint → same for every house.  

```java
public static String builder = "Modern Builders";
```

---

## ⚡ Fundamental Rule  
- A `static` method (like `main`) belongs to the class (blueprint).  
- A non-static variable (like `color`) belongs to an object (house).  
- ❌ Static cannot access non-static directly.  
- ✅ You must first create an object, then access it.  

---

## 💻 Code Example  
➡️ [See Full Code Here](Day_01-Classes_And_Objects.java)  

---

## 📝 Practice Questions  

### Q1  
Create a `Car` class with properties `brand` and `year`. Create one object and print its details.  
➡️ [Go to TODO in .java](Day_01-Classes_And_Objects.java#q1)  

---

### Q2  
Add a static variable `totalCarsCreated` in the `Car` class. Increment it every time a new object is created. Print the total after creating 3 objects.  
➡️ [Go to TODO in .java](Day_01-Classes_And_Objects.java#q2)  

---

### Q3  
Write a non-static method `startEngine()` that prints the car's brand. Can you call it directly from `main`? If not, why? Fix the code.  
➡️ [Go to TODO in .java](Day_01-Classes_And_Objects.java#q3)  

---

## 💡 Daily Tip  
👉 Whenever you’re confused about static vs. non-static, ask yourself:  
“Does this belong to the blueprint, or to a specific house built from the blueprint?”  

✅ This mental model solves 99% of beginner errors.  

---

## 🧠 AI Memory Hacks  
- **Static = “Same for All”** (like school rules).  
- **Object = “Own for Each”** (like home rules).  
- **new = Builder** who constructs real things from plans.  

---

## 📌 Solutions  
➡️ All solutions are to be written by YOU in [Day_01-Classes_And_Objects.java](Day_01-Classes_And_Objects.java)  

---

## 🔗 References  
- [Variables](#)  
- [Constructors](#)  
- [Class & Object](Day_01-Classes_And_Objects.md)  
