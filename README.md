
# PROGRAMMING ASSIGNMENT 3

## Linked Lists and Test Driven Development

For this assignment, you will implement <u>and test</u> a singly linked list, a doubly linked list, and a sorted doubly linked list. 

Using test-driven development, write tests for each method in the linked list interface _BEFORE_ implementing the methods.

The tests for each class should be in a separate test class. For example, the tests for the `SinglyLinkedList` class should be in the `SinglyLinkedListTest` class within the `app/src/test/java/csc223/<your initials>` package.

### **Question 1**. Node Class

<img src="https://i.ibb.co/ng6pCyw/Screen-Shot-2024-04-09-at-3-03-55-AM.png" alt="Node Class" width="50%">

Create a new file at path `app/src/main/java/csc223/<your initials>/Node.java` with a Node class. The Node class should have both a `next` and `previous` reference, as well as a `data` attribute of type `char`. 

Note that `char` type in Java is a 16-bit primitive data type that can represent any character in the Unicode character set.  Values of type `char` may be represented by literals enclosed in single quotes, such as `'A'` or `'1'`.  The nice thing about `char` type is that you can compare characters using the `==`, `<`, and `>` operators.  For example, 

```java
System.out.println('A' < 'B');  // true
System.out.println('A' == 'A'); // true
System.out.println('A' > 'B');  // false
```

### **Question 2**. Linked List Interface

Create a new file at path `app/src/main/java/csc223/<your initials>/LinkedList.java` with the following generic interface:

```java

// e.g., for Jane Doe: csc223.jd
package csc223.<your initials>;

public interface LinkedList{

    // Insert an item at the end of the list for unsorted lists
    void insert(char item);

    // Removes an item from the list
    void remove(char item);

    // Get the first item, return '☠' if the list is empty
    char getFirst();

    // Get the last item, return '☠' if the list is empty
    char getLast();

    // Get an item at a specific index, return '☠' if index is out of bounds
    char get(int index);

    // Get the size of the list
    int size();

    // Check if the list is empty
    boolean isEmpty();

    // Clear the list
    void clear();

    // Check if the list contains an item
    boolean contains(char item);

    // Get the index of an item, if it exists else return -1
    int indexOf(char item);

    // Get the last index of an item, if it exists else return -1
    int lastIndexOf(char item);

    // Reverse the list
    void reverse();

    // Creates and returns a String representation of the list
    // e.g. `A -> B -> C -> D` should return "ABCD"
    String toString();
}

```

### **Question 3**. Singly Linked List

<img src="https://i.ibb.co/mJxcf4k/Screen-Shot-2024-04-09-at-8-22-55-AM.png" alt="Singly Linked List" width="80%">

Implement the `LinkedList` interface in the `SinglyLinkedList` class. The class should implement a singly linked list, where each node has a reference to only the next node. 

Ignore (leave unchanged) the `previous` attribute in the `Node` class for this question.

You should consider using `protected` access modifiers for attributes and methods in the `SinglyLinkedList` class to allow for easy extension of the class for the next questions. 

### **Question 4**. Doubly Linked List

<img src="https://i.ibb.co/61fvLVz/Screen-Shot-2024-04-09-at-8-23-00-AM.png" alt="Doubly Linked List" width="80%">

Extend (inheritance) the `SinglyLinkedList` class and implement the `LinkedList` interface in the `DoublyLinkedList` class. The class should implement a doubly linked list, where each node has a reference to the next and previous nodes.

Do not repeat code that is already implemented in the `SinglyLinkedList` class. Instead, use the `super` keyword to call the superclass constructor and methods. e.g. `super.method(item);`

### **Question 5**. Sorted Doubly Linked List

Create a new class SortedLinkedList in the file `app/src/main/java/csc223/<your initials>/SortedLinkedList.java`. 

This class should:

* Implement the LinkedList interface
* Extend the DoublyLinkedList class
* Maintain elements in ascending order at all times, ensuring each new element is inserted at the correct position


Do not repeat code that is already implemented in the `DoublyLinkedList` class. Instead, use the `super` keyword to call the superclass constructor and methods. e.g. `super.method(item);`