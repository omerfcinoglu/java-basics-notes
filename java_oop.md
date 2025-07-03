# Java OOP Overview

**Description**  
Concise summaries of core OOP concepts in Java.

---

## Classes & Objects

- **Class**: Blueprint for objects.
- **Object**: Instance of a class.

```java
class Car { int wheels=4; }
Car c = new Car();
```

## Attributes (Fields)

- Variables in a class (also called fields).

```java
class Person { String name; int age; }
```

## Methods

- Functions inside classes, define behavior.
- Declaration: `[modifiers] returnType name(params) { }`

```java
public void drive() { /*...*/ }
```

## Static vs Instance

- **static**: belongs to class, accessed without object.
- **instance**: belongs to object, requires `new`.

## Constructors

- Special methods to initialize objects, same name as class, no return type.

```java
public Car() { wheels = 4; }
public Car(int w) { wheels = w; }
```

## this Keyword

- Refers to current object.

```java
public Car(int wheels) { this.wheels = wheels; }
```

## Modifiers

- **Access**: `public`, `private`, `protected`, _(default)_
- **Non-access**: `static`, `final`, `abstract`, `transient`, `synchronized`, `volatile`

## Inheritance

- **extends** to reuse code.

```java
class Vehicle { void honk(){} }
class Car extends Vehicle { }
```

## Polymorphism

- Same method, different behavior (overriding).

```java
class Animal { void sound(){} }
class Dog extends Animal { void sound(){ System.out.println("Woof"); } }
```

## super Keyword

- Access parent members or constructor.

```java
super.sound();
super(); // in constructor
```

## Inner Classes

- **Member**: non-static nested class.
- **Static**: `static class Inner {}`

```java
class Outer { class Inner{} static class StaticInner{} }
```

## Abstraction

- **abstract** classes/methods hide details.

```java
abstract class Animal { abstract void sound(); }
```

## Interfaces

- Declare methods without bodies; implement in classes.
- Multiple inheritance via interfaces.

```java
interface Movable { void move(); }
class Car implements Movable { public void move(){} }
```

## Enums

- Predefined constants, `public enum Day { MON, TUE, ... }`

```java
Day d = Day.MON;
```

## User Input (Scanner)

- From `java.util`.

```java
Scanner s = new Scanner(System.in);
int n = s.nextInt();
```

## Date & Time (java.time)

- `LocalDate`, `LocalTime`, `LocalDateTime` and `DateTimeFormatter`.

```java
LocalDate today = LocalDate.now();
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
```
