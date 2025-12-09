# Java Object-Oriented Programming – Notes

These notes summarize the key concepts from the **Java Object-Oriented Programming** course, covering how Java structures objects, behavior, and interactions in real-world applications.

---
# 1 - Classe and Objects in Java
## Checked and Unchecked Exceptions

Examples:
- InputMismatchException → Unchecked
- IOException → Checked

### Checked Exceptions
- Verified by the compiler.  
- Must be handled with try/catch or declared using throws.  
- Used when recovery is possible.

### Unchecked Exceptions
- Not verified by the compiler.  
- Occur at runtime due to logic errors or invalid states.  
- Used when recovery is not expected.

**Summary:**  
- Checked → recovery may be possible.  
- Unchecked → recovery not expected.

---

## Handling Multiple Exceptions

Ways to handle them:
- Polymorphism  
- Multiple catch blocks  
- Multi-catch block  

**Polymorphism example (handles the entire hierarchy):**
```java
try {
    readFile();
} catch (IOException e) {
    // handles all subclasses of IOException
}

---

## Understanding the Difference Between Class and Instance Members

### Representing a Physical Object in Code
- A class acts as a blueprint defining attributes, behaviors, and a constructor.
- The constructor is used to create instances (objects).
- Members can be organized into instance (non-static) members and static members.

### Instance (Non-Static) Member
Belongs to an individual object; each instance has its own copy.
Example:
Color trunkColor = new Color(102, 51, 0);

### Static Member
Belongs to the class itself and is shared across all instances.
Example:
```java
static void announceTree() {
    System.out.println("Look out for that tree!");
}

---

# 2 - Encapsulation in Java
### What's is encapsulation?

- Object-oriented programming principle
- Bind state and behavior together into a single unit
- Combine data and code acting on that data

- Java classes allow us to bind together data and related functionality
- We can implement parts of the encapsulation principle in Java with Classes

Benefits of encapsulation- Prevent classes from becoming tightly coupled.
- Easily modify the inner workings of one class without affecting the rest of the program.

It requires restriction:
We need a clear interface between given class and the rest of the program.
Everything can't have direct access.

### Discovering access modifiers
- Access modifier
Allows you to determine programmatically where certain variables and methods can be accessed in your code.

- Private: only visible in the class that the member lives in
- No-modifier: visible in the package it lives in
- Protected: visible to the package and all subclasses
- Public: accessible everywhere within the program.

### Implementing encapsulation with access modifiers
- When we want classes to access data from other classes indirectly trough a known pathway.

Achieve Encapsulation in java
- Restrict each attribute with the private access modifier
- Write accessible methods to get and set the values of each attribute with the public access modifier.
- Other classes will access data indireclty through public methods

---

# 3 - Inheritance
