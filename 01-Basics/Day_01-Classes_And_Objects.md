# 📘 Java Notes – Day_01: Classes, Objects & Non-Static Variables

---

## 🔹 Class and Object Basics

### ✅ What is a Class?
- A **class** is a blueprint or template used to create objects.  
- Defines **properties (fields/variables)** and **behaviors (methods/functions)**.  
- Example in real life:  
  - **Class = Car blueprint**  
  - **Objects = Tesla, BMW, Audi (real cars built from that design)**  

---

### ✅ What is an Object?
- An **object** is a runtime instance of a class.  
- Created using the `new` keyword.  
- Stored in **heap memory**.  
- Reference variable stores the **memory address** of the object.  

👉 Example in real life:  
- **Class = Pizza recipe**  
- **Object = Pizza you make from that recipe**  

---

### ✅ Example
```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }

    public static void main(String[] args) {
        // Creating first object
        Car c1 = new Car();
        c1.brand = "Tesla";
        c1.speed = 120;

        // Creating second object
        Car c2 = new Car();
        c2.brand = "BMW";
        c2.speed = 100;

        // Calling methods
        c1.drive(); // Tesla is driving at 120 km/h
        c2.drive(); // BMW is driving at 100 km/h
    }
}
```

---

## 🔹 Non-Static Variables (Instance Variables)

### ✅ Definition
- Declared inside a class but outside methods, **without `static` keyword**.  
- Each **object gets its own copy**.  
- Stored in **heap memory**.  
- Must be accessed through an **object reference**.  

---

### ✅ Properties
1. Belong to objects, not the class.  
2. Each object has its own **independent copy**.  
3. Cannot be accessed directly inside `static` methods.  
4. JVM gives **default values** if not initialized.  

---

### ✅ Example
```java
public class Student {
    int id;        // non-static variable
    String name;   // non-static variable

    public static void main(String[] args) {
        Student s1 = new Student();  // object 1
        s1.id = 101;
        s1.name = "Amit";

        Student s2 = new Student();  // object 2
        s2.id = 102;
        s2.name = "Neha";

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}
```

---

## 🔹 Default Values of Non-Static Variables

| Data Type | Default Value |
|-----------|---------------|
| int       | 0             |
| float     | 0.0           |
| double    | 0.0           |
| boolean   | false         |
| char      | '\u0000' (null char) |
| Object    | null          |

---

### ✅ Example
```java
public class Test {
    int x;        // default = 0
    boolean b;    // default = false
    String s;     // default = null

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("int: " + t.x);
        System.out.println("boolean: " + t.b);
        System.out.println("String: " + t.s);
    }
}
```

---

## 🔹 Difference: Static vs Non-Static Variables

| Feature           | Static Variable (Class Variable) | Non-Static Variable (Instance Variable) |
|-------------------|----------------------------------|------------------------------------------|
| Belongs To        | Class (shared by all objects)    | Each object (separate copy)              |
| Memory Location   | Method Area                      | Heap (inside object)                      |
| Copies            | One copy only                    | New copy for each object                  |
| Access            | ClassName or object reference    | Only through object reference             |
| Lifetime          | Till class is unloaded           | Till object is destroyed                  |

---

## 📝 Summary
- **Class = blueprint**, **Object = instance**.  
- Non-static variables → object-level, separate copy per object.  
- Must use object to access non-static variables inside static methods.  
- JVM provides default values automatically.  

---

## 💡 Memory Trick
🔑 **Static = whiteboard (shared by the class)**  
🔑 **Non-static = personal notebook (separate for each student)**  

---

## 🏋️ Practice Questions

Q1. Create a class `Student` with variables `id` and `name`. Create 2 objects and print their details.  

Q2. Create a class `Dog` with variable `breed` and method `bark()`. Create 2 objects and call the method.  

Q3. Create a class `Car` with variables `brand`, `model`, and `price`. Create 3 objects with different values and print them.  

Q4. Demonstrate that changing the variable of one object does not affect another object’s variable.  

Q5. Create a class `BankAccount` with instance variables `accountNumber` and `balance`.  
   - Create multiple objects and set different balances.  
   - Print balances separately to show independence.  

Q6. Create a class `Employee` with variables `id`, `name`, and `salary`.  
   - Create an array of 5 employees.  
   - Print all details using a loop.  

👉 [Go to Solutions File](Day_01-Classes_And_Objects.java)

---

✅ Next Topic (Day_02): **Static Variables vs Non-Static Variables**


🔙 [Back to Main Roadmap(README)](../README.md)
