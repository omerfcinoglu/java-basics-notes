# Java Notes

This repository contains comprehensive Java study notes, organized into three main topics. Click any link below to view the detailed Markdown file.

## Contents

| File                                       | Description                                                                                                                                                    |
| ------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [java_basics.md](./notes/java_basics.md)   | Java Fundamentals: variables, data types, type casting, control flow, loops, arrays.                                                                           |
| [java_methods.md](./notes/java_methods.md) | Java Methods: declaration, parameters, return values, overloading, recursion.                                                                                  |
| [java_oop.md](./notes/java_oop.md)         | Object-Oriented Programming: classes, objects, inheritance, polymorphism, encapsulation, [interfaces and abstract classes](./notes/java_interface_abstract.md) |

## Acknowledgements

These notes are based on the [W3Schools Java Tutorial](https://www.w3schools.com/java/).

# [Pet Owner Example](./pet_owner_example/Main.java)

A small Java application demonstrating core OOP concepts:

- **`Pet`** (interface) → defines a pet’s ability to play
- **`Animal`** (abstract class) → holds common fields and behaviors (`name`, `age`, `getInfo()`, `makeSound()`)
- **`Dog`** and **`Cat`** → extend `Animal`, implement `Pet`, and customize their sound and play methods
- **`Owner`** → can own any `Pet`, provides methods to play with the pet and introduce it (using a cast to call `getInfo()`)
- **`Main`** → creates sample `Dog` and `Cat` objects, has `Owner` interact with them, and invokes their sounds
