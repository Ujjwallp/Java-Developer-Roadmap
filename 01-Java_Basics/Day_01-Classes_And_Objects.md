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
9. [Solutions](#-solutions)  
10. [References](#-references)  

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
- Each
