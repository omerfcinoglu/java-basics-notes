# Java Methods

## Method Syntax

Java method declaration:

```java
[modifiers] returnType methodName(paramType1 param1, paramType2 param2, ...) {
    // method body
}
```

### Example Syntax

```java
public static int add(int a, int b) {
    return a + b;
}
```

## Parameters

- Java parameters are always **pass-by-value**.
- Syntax: type before name (`int a`), no `ref` or `out`.
- **Differences with C#**:
  - Java does not support `ref`/`out`; all primitives and references are passed by value.
  - No named or optional parameters.
  - Varargs syntax: `type... name` (e.g., `String... args`) instead of C# `params type[] name`.

## Method Overloading

Multiple methods can share the same name with different parameter lists.

```java
static int plus(int x, int y) {
    return x + y;
}

static double plus(double x, double y) {
    return x + y;
}
```

### Example Usage

```java
public class Main {
    static int plus(int x, int y) {
        return x + y;
    }

    static double plus(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("int: " + plus(8, 5));       // int: 13
        System.out.println("double: " + plus(4.3, 6.26)); // double: 10.56
    }
}
```

## Scope

Variables are only accessible within the region they are declared (scope).

### Method Scope

Variables declared inside a method are accessible anywhere in the method after their declaration:

```java
public void example() {
    // code here CANNOT use x

    int x = 100;

    // code here CAN use x
    System.out.println(x);
}
```

### Block Scope

Variables declared in a block ({ }) are only accessible within that block:

```java
public void example() {
    {
        int x = 100;
        System.out.println(x); // OK
    }
    // x is not accessible here
}
```

## Recursion

A technique where a method calls itself to solve a problem.

### Basic Recursion Example

```java
public static int sum(int k) {
    if (k > 0) {
        return k + sum(k - 1);
    } else {
        return 0; // base case
    }
}
```

### Range Recursion Example

```java
public static int sum(int start, int end) {
    if (end > start) {
        return end + sum(start, end - 1);
    } else {
        return end; // base case
    }
}
```
