package csc223.tw;

public class SortedLinkedList extends DoublyLinkedList {
    Node head;
    Node curr;
    int size;

    public void SortedLinkedList(){
        super.DoublyLinkedList();
    }

    public void insert(char item){
        while (this.curr.previous.data < this.curr.data && this.curr.next.data > this.curr.data){
            super.insert(item);
        }
    }

    public void remove(char item){
        super.remove(item);
    }

    public char getFirst(){
        return super.getFirst();
    }

    public char getLast(){
        return super.getLast();
    }

    public char get(int index){
        return super.get(index);
    }

    public int size(){
        return super.size();
    }
    
    public boolean isEmpty(){
        return super.isEmpty();
    }

    public void clear(){
        super.clear();
    }

    public boolean contains(char item){
        return super.contains(item);
    }

    public int indexOf(char item){
        return super.indexOf(item);
    }

    public int lastIndexOf(char item){
        return super.lastIndexOf(item);
    }

    public void reverse(){
        super.reverse();
    }

    public String toString(){
        return super.toString();
    }
}
