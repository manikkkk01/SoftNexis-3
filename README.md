# EvenOdd Checker

A simple Java program that determines whether a number is **Even** or **Odd**.  
Includes both a static check and interactive input from the user.

---

## Features
- Static value test
- User input test (via `Scanner`)
- Input validation for integers
- Uses **ternary operator** for concise decision-making

---

## How It Works
1. **Static check**:
   ```java
   int staticNumber = 27;
   checkAndPrint(staticNumber);

2.User input check;
```java
  Scanner scanner = new Scanner(System.in);
  int userNumber = scanner.nextInt();
  checkAndPrint(userNumber);

3.Ternary Operator;
``` java
String result = (number % 2 == 0) ? "Even" : "Odd";

4.Run the Program;
```java
   javac EvenOddChecker.java
   java EvenOddChecker


