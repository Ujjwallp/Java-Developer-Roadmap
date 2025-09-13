# 📘 Day 1: Class, Object, new & Static vs Non-Static  

---

## 🏗️ 1. The Blueprint: What is a Class?  
Think of a **Class** as a **blueprint or template**.  
It helps us create **Objects**.  

### 💭 Real-Life Example  
A house blueprint → shows layout, but you can’t live in it.  

### 💻 In Java  
Defines:  
- Properties → Variables  
- Actions → Methods  

---

## 🚗 2. The Real Thing: What is an Object?  
An **Object** is the real house built from the blueprint.  
Stored in memory with its own values.  

### 💭 Real-Life Example  
A real house → has a specific color, rooms, and you can live in it.  

### 💻 In Java  
- Instance of a Class.  
- Each object has its own unique properties.  

---

## 👷 3. The Builder: The `new` Keyword  
The **new** keyword is like a builder.  

```java
Car car1 = new Car();
⚖️ 4. static vs. non-static: The Golden Rule
🔴 Non-static (Object-Level)
Belongs to individual objects.

Each object has its own copy.

java
Copy code
String color;
🔵 static (Class-Level)
Belongs to the blueprint (class).

Shared by all objects.

java
Copy code
public static String builder = "Modern Builders";
⚡ Fundamental Rule
Static exists before objects.

Non-static exists only after new.

❌ Static cannot access non-static directly.

✅ Create an Object first, then access.

💡 5. Daily Tip
👉 Whenever you’re confused about static vs. non-static, ask yourself:
“Does this belong to the blueprint, or to a specific house built from the blueprint?”

This solves 99% of beginner errors.

📌 References
Variable

Constructor

Class & Object
