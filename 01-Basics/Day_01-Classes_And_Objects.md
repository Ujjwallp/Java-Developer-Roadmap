# 📘 Java Notes – Classes, Objects & Non-Static Variables

---

## 🔹 Class and Object Basics

### ✅ What is a Class?
- A **class** is a blueprint or template used to create objects.  
- It defines the **properties (variables/fields)** and **behaviors (methods/functions)** of an entity.  
- Example in real life:  
  - **Class = Car design (blueprint)**  
  - **Objects = Tesla, BMW, Audi (real cars built from that design)**  

---

### ✅ What is an Object?
- An **object** is a runtime instance of a class.  
- Objects are created using the `new` keyword.  
- Objects live in **heap memory**.  
- Reference variable stores the **memory address** of the object.  

👉 Example in real life:  
- **Class = Recipe of Pizza**  
- **Object = The actual pizza you cooked from recipe**  

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
- Declared inside a class but outside methods, without `static` keyword.  
- Each **object gets its own copy** of these variables.  
- Stored in **heap memory**.  
- Must be accessed through an **object reference**.  

---

### ✅ Key Properties
1. Belongs to the object, not the class.  
2. Every object has **its own independent copy**.  
3. Cannot be accessed directly inside a `static` method (`main`).  
4. If not initialized, JVM provides **default values**.  

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
If not initialized, JVM assigns default values:

| Data Type | Default Value |
|-----------|---------------|
| int       | 0             |
| float     | 0.0           |
| double    | 0.0           |
| boolean   | false         |
| char      | '\u0000' (null char) |
| Object ref| null          |

---

### ✅ Example
```java
public class Test {
    int x;       // default → 0
    boolean b;  // default → false
    String s;   // default → null

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

| Feature                | Static Variable                     | Non-Static Variable |
|-------------------------|-------------------------------------|---------------------|
| Belongs to              | Class (shared)                     | Object (separate copy) |
| Memory Location         | Method Area                        | Heap (inside object) |
| Access                  | ClassName or object reference      | Only via object reference |
| Default Value           | Given by JVM if not initialized    | Given by JVM if not initialized |
| Lifetime                | Till class is unloaded             | Till object is destroyed |

---

## 📝 Summary
- **Class = blueprint**, **Object = instance**.  
- Non-static variables → belong to objects, separate copy per object.  
- Cannot be accessed directly from static methods.  
- JVM gives default values if not initialized.  
- Objects are created using `new` keyword, stored in heap, reference stored in variable.  

---

## 💡 Memory Trick
🔑 **Static = whiteboard (shared by whole class)**  
🔑 **Non-static = personal notebook (private for each student)**  

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

---

✅ Next Topic: **Static Variables vs Non-Static Variables**
