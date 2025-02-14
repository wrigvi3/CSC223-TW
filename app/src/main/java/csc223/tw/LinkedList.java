package csc223.tw;

public interface LinkedList {
    //Insert an item at the end of the list for unsorted lists
    void insert(char item);

    //Removes an item from the list
    void remove(char item);

    //Get the first item, return '☠' if the list is empty
    char getFirst();

    //Get the last item, return '☠' if the list is empty
    char getLast();

    //Get an item at a specific index, return '☠' if index is out of bounds
    char get(int index);

    //Get the size of the list
    int size();

    //Check if the list is empty
    boolean isEmpty();

    //Clear the list
    void clear();

    //Check if the list contains an item
    boolean contains(char item);

    //Get the index of an item, if it exists else return -1
    int lastIndexOf(char item);

    //Reverse the list
    void reverse();

    //Creates and returns a String representation of the list
    // e.g. A -> B -> C -> D should return "ABCD"
    String toString();
}
