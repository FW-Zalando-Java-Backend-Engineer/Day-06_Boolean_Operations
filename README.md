# **📘 Day-06: Logical Operations & Ternary Operator in Java**  
Welcome to **Day-06** of our Java learning journey! Today, we’ll focus on how to control the **flow of logic** using **boolean expressions**, **logical operators**, and the powerful and compact **ternary operator**.

These tools help you build smarter, more dynamic, and readable conditions in your programs.

---

## **📌 Lesson Structure**
### **1️⃣ Introduction to Logical Operators**
- Understanding **boolean logic**
- What are **logical operators**?
- What is a **truth table**?

### **2️⃣ Logical Operators in Java**
- **AND (`&&`)**: True if both sides are true
- **OR (`||`)**: True if at least one side is true
- **NOT (`!`)**: Inverts boolean value

### **3️⃣ Ternary Operator**
- Compact if-else: `condition ? trueResult : falseResult;`
- Replaces simple `if-else` statements for clean code

---

## **📜 Live Coding Examples**

### **🖥️ Basic Boolean Logic**
```java
public class BooleanDemo {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isCoffeeCold = false;

        System.out.println("Java is fun: " + isJavaFun);
        System.out.println("Coffee is cold: " + isCoffeeCold);
        System.out.println("Is both true? " + (isJavaFun && isCoffeeCold));
        System.out.println("Is either true? " + (isJavaFun || isCoffeeCold));
        System.out.println("Is Java NOT fun? " + (!isJavaFun));
    }
}
```

---

### **🖥️ Ternary Operator Example**
```java
public class TernaryExample {
    public static void main(String[] args) {
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("You are: " + result);
    }
}
```

---

## **🎯 Guided Exercises for Slack**

### **🧪 Exercise 1: Understanding Boolean Variables**
```plaintext
🚀 Exercise 1: Boolean Logic 101
🧠 Objective: Learn how boolean variables behave.

✅ Step-by-step:
1. Create a class `BooleanPractice`.
2. Declare two boolean variables:
   - `isHungry = true`
   - `hasFood = false`
3. Print the result of:
   - `isHungry && hasFood`
   - `isHungry || hasFood`
   - `!isHungry`

🎉 Expected:
- You'll understand what `&&`, `||`, and `!` do!
```

---

### **🧪 Exercise 2: Combine Comparisons with Logic**
```plaintext
🚀 Exercise 2: Logical Conditions in Action
🧠 Objective: Combine comparisons using logical operators.

✅ Step-by-step:
1. Create a class `LogicCheck`.
2. Declare: `int score = 75; int bonus = 10;`
3. Use logical expressions to print:
   - Is score > 70 AND bonus > 5?
   - Is score > 90 OR bonus > 5?
   - Is score < 50 OR bonus < 5?

💡 Hint: Use `System.out.println(...)` with logical expressions.
```

---

### **🧪 Exercise 3: Ternary for Pass/Fail**
```plaintext
🚀 Exercise 3: Pass or Fail using Ternary
🧠 Objective: Use ternary operator for decision making.

✅ Step-by-step:
1. Create a class `TernaryPassCheck`.
2. Declare: `int mark = 68;`
3. Use ternary operator to check:
   - `"Pass"` if mark >= 50
   - `"Fail"` otherwise
4. Print the result.

🧪 Ternary Syntax: `String result = (mark >= 50) ? "Pass" : "Fail";`
```

---

### **🧪 Exercise 4: Even or Odd Checker (Ternary)**
```plaintext
🚀 Exercise 4: Even or Odd
🧠 Objective: Use ternary operator to check if a number is even or odd.

✅ Step-by-step:
1. Create a class `EvenOddCheck`.
2. Declare an int: `int number = 11;`
3. Use ternary to print `"Even"` if divisible by 2, else `"Odd"`.

📌 Hint: `number % 2 == 0 ? "Even" : "Odd"`
```

---

### **🧪 Exercise 5: Complex Conditions with AND/OR**
```plaintext
🚀 Exercise 5: Access Permission System
🧠 Objective: Use logical conditions to control access.

✅ Step-by-step:
1. Create a class `AccessSystem`.
2. Declare:
   - `boolean isAdmin = false;`
   - `boolean hasPassword = true;`
3. Print:
   - Allow access if (isAdmin OR hasPassword)
   - Deny access if neither is true

✅ Output:
"Access Granted" or "Access Denied"
```

---

### **🧪 Exercise 6: Nested Ternary Challenge**
```plaintext
🚀 Exercise 6: Grading System
🧠 Objective: Use nested ternary operators to assign grades.

✅ Step-by-step:
1. Create a class `GradeEvaluator`.
2. Declare: `int score = 82;`
3. Use nested ternary to assign:
   - "A" if score >= 90
   - "B" if 80-89
   - "C" if 70-79
   - "Fail" otherwise
4. Print the grade.

💡 Hint:
String grade = (score >= 90) ? "A" :
               (score >= 80) ? "B" :
               (score >= 70) ? "C" : "Fail";
```

---

## **📚 Additional Resources**
- **[Java Logical Operators (Oracle)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)**  
- **[Java Ternary Operator (W3Schools)](https://www.w3schools.com/java/java_conditions.asp)**  
- [Video Lesson Recording](https://us06web.zoom.us/rec/share/OwFOYRz3viCRNvw1N71aX8go1yTAvL29ppGRWw6OhbVpNIcgBZAOjiON8_h291A7.zVodS6ufinDjz6Co)
- [Live Code Examples](https://github.com/FW-Zalando-Java-Backend-Engineer/Day-06_Boolean_Operations/tree/main/Day_6)  

---

## 🚀 Wrap-up
Excellent work today! You’ve practiced powerful control tools to make smarter Java decisions with fewer lines of code. These are fundamental skills for writing clean, efficient logic in your apps.

---
