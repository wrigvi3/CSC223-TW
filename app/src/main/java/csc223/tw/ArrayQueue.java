package csc223.tw;


public class ArrayQueue implements Queue{
    int[] data;
    int front;
    int curr;
    int capacity;
    int size;

    public ArrayQueue(){
        this.capacity = 10;
        this.data = (int[]) new int[this.capacity];
        this.front = 0;
        this.curr = 0;
        this.size = 0;
    }
    @Override
    public void enqueue(int item){
        if (this.curr < this.capacity){
            this.data[this.curr] = item;
            this.curr += 1;
            this.size += 1;
        }
        else{
            this.capacity = this.capacity + 10;
            int[] newdata = (int[]) new int[this.capacity];

            for (int i=0; i < this.capacity; i++){
                newdata[i] = this.data[i];
            }
            this.data = newdata;
            this.data[curr] = item;
            this.curr += 1;
            this.size += 1;
        }
    }
    @Override
    public int dequeue(){
        if (this.curr == 0){
            return -1;
        }
        else{
            int x = data[front];
            this.front += 1;
            this.size -= 1;
            return x;
        }
    }
    @Override
    public int peek(){
        if (this.curr == 0){
            return -1;
        }
        return data[front];
    }
    @Override
    public boolean isEmpty(){
        return this.size == 0;
    }
    @Override
    public int size(){
        return this.size;
    }
}
