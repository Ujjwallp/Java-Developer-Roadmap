# 📘 Day 1: Class, Object, new & Static vs Non-Static  

---

## 🏗️ 1. The Blueprint: What is a Class?  
Think of a **Class** as a **blueprint or template**.  
It helps us create **Objects**.  

### 💭 Real-Life Example  
A **house blueprint** → shows layout, but you can’t live in it.  

### 💻 In Java  
Defines:  
- **Properties** → Variables  
- **Actions** → Methods  

```java
class Car {
    String color;   // property
    int speed;      // property

    void drive() {  // action
        System.out.println("Car is driving...");
    }
}```
🚗 2. The Real Thing: What is an Object?
An Object is the real house built from the blueprint.
It is stored in memory with its own values.

💭 Real-Life Example
A real house → has a specific color, rooms, and you can live in it.

💻 In Java
Instance of a Class.

Each object has its own unique properties.

```
Car car1 = new Car();   // First Object
Car car2 = new Car();   // Second Object
```
👷 3. The Builder: The new Keyword
The new keyword is like a builder.
It creates an Object from a Class blueprint.

```
Car car1 = new Car();```
⚖️ 4. static vs. non-static: The Golden Rule
🔴 Non-static (Object-Level)
Belongs to individual objects.

Each object has its own unique copy.

💭 Example: One house is red, another is blue → color belongs to each house.
```
String color;```
🔵 static (Class-Level)
Belongs to the class blueprint itself.

Only one copy exists, shared by all objects.

💭 Example: The architect’s name on the blueprint → same for every house.

```
public static String builder = "Modern Builders";```
⚡ Fundamental Rule
Static exists before objects.

Non-static exists only after new.

❌ Static cannot access non-static directly.
✅ You must first create an Object, then access.

💡 5. Daily Tip
👉 Whenever you’re confused about static vs. non-static, ask yourself:
“Does this belong to the blueprint, or to a specific house built from the blueprint?”

✅ This mental model solves 99% of beginner errors.

📌 References
Variable

Constructor

Class & Object
