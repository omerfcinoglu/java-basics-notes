# Java Basics

**Description**  
These notes are based on the W3Schools Java Tutorial.  
Refer to [W3Schools Java Tutorial](https://www.w3schools.com/java/) for the original content.

---

## Variables
Variables are containers for storing data values. In Java, common variable types include:
- `String` – stores text, e.g. `"Omer"`.
- `int` – stores whole numbers, e.g. `42` or `-42`.
- `float` – stores floating-point numbers, e.g. `3.14f` or `-3.14f`.
- `char` – stores single characters, e.g. `'A'`. (Char values are surrounded by single quotes.)
- `boolean` – stores `true` or `false`.

To declare a variable:
```java
type variableName = value;
```

**Examples**
```java
String name = "Omer";
System.out.println(name);    // Outputs "Omer"

int myNum = 42;
System.out.println(myNum);   // Outputs 42

int anotherNum;
anotherNum = 25;
System.out.println(anotherNum);  // Outputs 25

int num = 10;
num = 20;  // num is now 20
System.out.println(num);         // Outputs 20
```

---

## Final Variables (Constants)
Make a variable unchangeable with `final`:
```java
final int myNum = 15;
myNum = 20; // Error: cannot assign a value to a final variable
```

---

## Data Types
A Java variable must have a specified data type:
```java
int    myNum     = 5;      // Integer (whole number)
float  myFloat   = 3.14f;  // Floating-point number
char   myChar    = 'A';    // Character
boolean myBool   = false;  // Boolean
String myText    = "Hello"; // String
```

### Categories
- **Primitive**: `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`  
- **Non-Primitive**: `String`, `Arrays`, `Classes`  

---

## Primitive vs Non-Primitive
- **Primitive** types are predefined, start lowercase, and hold a single value.  
- **Non-Primitive** (reference) types start uppercase, can be `null`, and have methods.

---

## Type Casting
Converting one primitive type to another:

- **Widening** (automatic):  
  `byte → short → char → int → long → float → double`

- **Narrowing** (manual):
  `double → float → long → int → char → short → byte`

### Widening Example
```java
int myInt = 9;
double myDouble = myInt; // int → double automatically

System.out.println(myInt);     // 9
System.out.println(myDouble);  // 9.0
```

### Narrowing Example
```java
double myDouble = 9.78d;
int myInt = (int) myDouble;  // double → int manually

System.out.println(myDouble); // 9.78
System.out.println(myInt);    // 9
```

---

## Operators
Java operators (`+`, `-`, `*`, `/`, `%`, `==`, `!=`, `<`, `>`, `&&`, `||`, etc.) work similarly to other languages and are not covered here.

---

## Strings
Strings store text and are objects.  
```java
String greeting = "Hello, Omer";
```

### Length
```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println(txt.length());  // Outputs 26
```

### Common Methods
```java
String txt = "Hello World";
System.out.println(txt.toUpperCase()); // "HELLO WORLD"
System.out.println(txt.toLowerCase()); // "hello world"
```

### Finding Substrings
```java
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
```

### Concatenation
```java
String firstName = "Omer";
String lastName  = "Faruk";
System.out.println(firstName + " " + lastName);     // "Omer Faruk"
System.out.println(firstName.concat(lastName));      // "OmerFaruk"
```

### Escape Sequences
Use backslash `\` to include special characters:
- `"` double quote  
- `'` single quote  
- `\\` backslash  

```java
String txt = "We are the so-called \"Vikings\" from the north.";
String txt2 = "It\'s a beautiful day.";
String txt3 = "The path C:\\Users\\Omer is important.";
```

Other valid escape sequences:
- `\n` New line  
- `\r` Carriage return  
- `\t` Tab  
- `\b` Backspace  
- `\f` Form feed  

---

## Control Flow

### if…else
```java
int time = 20;
if (time < 18) {
    System.out.println("Good day.");
} else {
    System.out.println("Good evening.");
}
```

### Ternary Operator
```java
String reply = (time < 18) ? "Good day." : "Good evening.";
```

### switch
```java
int day = 4;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    default:
        System.out.println("Weekend");
}
```

---

## Loops

### while / do…while
```java
int i = 0;
while (i < 3) {
    System.out.println(i);
    i++;
}

do {
    System.out.println(i);
    i--;
} while (i > 0);
```

### for / break / continue
```java
for (int i = 0; i < 5; i++) {
    if (i == 2) continue; // skip when i is 2
    if (i == 4) break;    // stop loop at i = 4
    System.out.println(i);
}
```

---

## Arrays

### Single-Dimensional
```java
String[] cars = {"Volvo", "BMW", "Ford"};
for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
}
```

#### For-Each
```java
for (String car : cars) {
    System.out.println(car);
}
```

### Multi-Dimensional
```java
int[][] numbers = { {1, 2}, {3, 4, 5} };
System.out.println(numbers[1][2]); // 5

// Changing a value
numbers[1][2] = 6;
System.out.println(numbers[1][2]); // 6
```

#### Looping Through 2D
```java
for (int[] row : numbers) {
    for (int n : row) {
        System.out.println(n);
    }
}
```
