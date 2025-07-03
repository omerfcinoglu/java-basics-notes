## 1. Abstract Classes

- **Definition**: A class declared with the `abstract` keyword.
- **Can contain**

  - **Abstract methods** (no body) that **must** be implemented by subclasses.
  - **Concrete methods**, fields, constructors.

- **Cannot be instantiated** directly. You use them as a base for other classes.

```java
// Abstract class with one abstract and one concrete method
public abstract class Animal {
    protected String name;

    public Animal(String name) {        // constructor
        this.name = name;
    }

    public abstract void makeSound();   // abstract method

    public void sleep() {               // concrete method
        System.out.println(name + " is sleeping");
    }
}

// Subclass must implement makeSound()
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
```

---

## 2. Interfaces

- **Definition**: A type declared with the `interface` keyword.
- **Can contain** (Java 8+):

  - **Abstract methods** (implicitly `public abstract`).
  - **Default methods** (with `default` keyword + body).
  - **Static methods**.
  - **Constants** (`public static final` fields).

- **Cannot have** instance fields or constructors.
- **Can be implemented by any class**, and a class may implement **multiple** interfaces.

```java
// Interface with an abstract and a default method
public interface Movable {
    void move(int distance);             // abstract by default

    default void stop() {                // optional implementation
        System.out.println("Stopped.");
    }

    static void service() {               // utility method
        System.out.println("Servicing...");
    }
}

// Class implements Movable
public class Car implements Movable {
    @Override
    public void move(int distance) {
        System.out.println("Car drives " + distance + " km.");
    }
}
```

---

## 3. Key Differences

| Feature              | Abstract Class                | Interface                              |
| -------------------- | ----------------------------- | -------------------------------------- |
| Multiple inheritance | No (only single extends)      | Yes (can implement many interfaces)    |
| Fields               | Can have instance fields      | Only `public static final` (constants) |
| Constructors         | Yes                           | No                                     |
| Method bodies        | Can mix abstract & concrete   | Only abstract, default, or static      |
| Access modifiers     | Can use any (`private`, etc.) | Methods are `public` by default        |
| Use case             | Share base behavior/state     | Define a contract / capability         |

---

## 4. Full Examples

### Abstract Class in Action

```java
abstract class Shape {
    String color;
    public Shape(String color) {
        this.color = color;
    }
    public abstract double area();       // must implement
    public void describe() {
        System.out.println("A " + color + " shape");
    }
}

class Circle extends Shape {
    double radius;
    public Circle(String color, double r) {
        super(color);
        this.radius = r;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle("red", 2.5);
        c.describe();                     // A red shape
        System.out.println(c.area());     // 19.634954...
    }
}
```

### Interface in Action

```java
interface Printable {
    void print();                       // abstract
    default void info() {               // optional
        System.out.println("Printable");
    }
}

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

public class Main {
    public static void main(String[] args) {
        Printable doc = new Document();
        doc.info();                     // Printable
        doc.print();                    // Printing document...
    }
}
```
