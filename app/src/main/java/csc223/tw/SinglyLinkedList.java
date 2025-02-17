package csc223.tw;

public class SinglyLinkedList {
    Node head;
    Node curr;
    int size;

    public void SinglyLinkedList(){
        this.head = null;
        this.curr = this.head;
        this.size = 0;
    }

    public void insert(char item){
        Node newNode = new Node(item);
        this.curr.next = newNode;
        this.curr = this.curr.next;
        this.size += 1;
        if (this.head == null){
            this.head = newNode;
        }
    }

    public void remove(char item){
        
        while (this.curr != null) {
            if (this.curr.data == item){
                this.curr.data = this.curr.next.data;
                this.curr.next = this.curr.next.next;
                
                this.size -= 1;
            }
            this.curr = this.curr.next;
        }
    }

    public char getFirst(){
        if (this.head == null){
            return '☠';
        }
        char currdata = (char) this.head.data;
        return currdata;
    }

    public char getLast(){
        int count = 0;
        while (this.curr != null){
            if (count == this.size){
                char currdata = (char) this.curr.data;
                return currdata;
            }
            count += 1;
            this.curr = this.curr.next;
        }
        return '☠';
    }

    public char get(int index){
        int count = 0;
        while (this.curr != null){
            if (count == index){
                char currdata = (char) this.curr.data;
                return currdata;
            }
            this.curr = this.curr.next;
        }
        return '☠';
    }
    
    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void clear(){
        this.head = null;
    }

    public boolean contains(char item){
        while (this.curr != null){
            if (this.curr.data == item){
                return true;
            }
            this.curr = this.curr.next;
        }
        return false;
    }

    public int indexOf(char item){
        int count = 0;
        while (this.curr != null){
            if (this.curr.data == item){
                return count;
            }
            this.curr = this.curr.next;
            count += 1;
        }
        return -1;
    }

    public int lastIndexOf(char item){
        for (int i = this.size; this.curr != null; i--){
            if (this.curr.data == item){
                return i;
            }
            this.curr = this.curr.next;
        }

        return -1;
    }

    public void reverse(){
        Node nextNode = null;
        Node newHead = null;

        while (this.curr != null){
            nextNode = this.curr.next;
            this.curr.next = newHead;
            newHead = this.curr;
            this.curr = nextNode;
        }
    }

    public String toString(){
        String s = new String();

        while (this.curr != null){
            s = s + this.curr.data;
            this.curr = this.curr.next;

        }

        return s;
    }
}