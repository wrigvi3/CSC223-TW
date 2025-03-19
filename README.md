# PROGRAMMING ASSIGNMENT 6

**Due: Tuesday, March 19th, 2025, 2:30 PM**

--- 

<br/>
<h1><center>HEAPS</h1></center>

<br/>

Implement a Heap data structure, using Array-based representation, with the following public methods:

1. `insert(char value)`: Inserts a new element to the heap.
2. `delete()`: Deletes the root element from the heap.
3. `peek()`: Returns the root element of the heap.
4. `size()`: Returns the number of elements in the heap.
5. `isEmpty()`: Returns true if the heap is empty, and false otherwise.
6. `clear()`: Clears the heap.
7. `toString()`: Returns a string representation of all elements in the heap.

Please work in groups of three for this assignment and divide the work as follows: 

- One person implements the MaxHeap class.
- One person implements the MinHeap class.
- One person implements the JUnit test cases for both MinHeap and MaxHeap.

The division of work above must be reflected in the commit history of your repository i.e. the commit history must show the one person worked on the MaxHeap class, the other person worked on the MinHeap class, and the third person worked on the JUnit test cases.

Note that the division of work above would ensure no merge conflicts occur when you push your changes to GitHub. 

The common Heap interface that both the MaxHeap and MinHeap classes should implement is as follows:

```java
package csc223.<your initials>;

public interface Heap {

    // Insert an item to the heap
    void insert(char value);

    // Delete the root element from the heap
    void delete();

    // Get the root element of the heap
    char peek();

    // Get the size of the heap
    int size();

    // Check if the heap is empty
    boolean isEmpty();

    // Clear the heap
    void clear();

    // Return a string representation of all elements in the heap
    String toString();
}
```

One of you needs to add the other two as collaborators to your repository (forked version, one associated with your username, not CSC223) for this assignment. 

To add collaborators to your repository, go to the repository on GitHub, click on the "Settings" tab, then click on "Manage access" in the left sidebar. Click on the "Invite a collaborator" button and add the GitHub usernames of your group members.


## Evaluation

Your submission will be evaluated based on the correctness **_and completeness_** of your implementation and test cases. If your implementation is correct but your test cases are incomplete, you will lose points. If your implementation is incorrect, you will lose even more points.

