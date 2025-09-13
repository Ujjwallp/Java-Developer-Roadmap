[⬅ Back to README](../README.md)  

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
9. [⚡ Interview Alert](#-interview-alert)  
10. [🧠 Memory Hacks](#-memory-hacks)  
11. [References](#-references)  

---

## 🏗️ The Blueprint: What is a Class?  
Think of a **Class** as a **blueprint or template**.  
It helps us create **Objects**.  

💭 **Real-Life Example**:  
A **house blueprint** → shows layout, but you can’t live in it.  

💻 **In Java**:  

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

```java
Car car1 = new Car();   // First Object
Car car2 = new Car();   // Second Object
```

### 🗂️ Memory Diagram  

```
Heap (Objects)          Stack (References)
-----------------        -----------------
Car@101 {color=Red}  <-  car1
Car@102 {color=Blue} <-  car2
```

💡 **Hinglish Explain:**  
Heap = badi almari jisme Java **asli objects** rakhta hai.  
Stack = chhota daftar jisme **reference slips** rakhi hoti hain.  
`car1` ek slip hai jo almari ke locker `Car@101` ki taraf point karti hai.  
Matlab **object heap me hota hai, reference stack me**.  

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
➡️ See Full Code in **Day_01-Classes_And_Objects.java**  

---

## 📝 Practice Questions  

**Q1.** Create a `Car` class with properties `brand` and `year`. Create one object and print its details.  
➡️ [Solution (Java) — lines 45–62](Day_01-Classes_And_Objects.java#L45-L62)

**Q2.** Add a static variable `totalCarsCreated` in the `Car` class. ...  
➡️ [Solution (Java) — lines 70–95](Day_01-Classes_And_Objects.java#L70-L95)

**Q3.** Write a non-static method `startEngine()` ...  
➡️ [Solution (Java) — lines 110–130](Day_01-Classes_And_Objects.java#L110-L130)

---

## 💡 Daily Tip  
👉 Whenever you’re confused about static vs. non-static, ask yourself:  
“Does this belong to the blueprint, or to a specific house built from the blueprint?”  

✅ This mental model solves 99% of beginner errors.  

---

## ⚡ Interview Alert  
- **Class vs Object** → Very common fresher-level interview question.  
- **static vs non-static** → Almost guaranteed in interviews (MCQ + coding).  
- **new keyword** → Frequently asked: *“What happens in memory when you write `new`?”*  

---

## 🧠 Memory Hacks  
- **Static = “Same for All”** (like school rules).  
- **Object = “Own for Each”** (like home rules).  
- **new = Builder** who constructs real things from plans.  

---

## 🔗 References  
- [Variables](#)  
- [Constructors](#)  
- [Class & Object](Day_01-Classes_And_Objects.md)  
