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