package csc223.tw;

public class MaxHeap implements Heap{

    char[] heap;
    int capacity;
    int size;
    int end;

    public MaxHeap(){
        this.heap = (char[]) new char[this.capacity];
        this.capacity = 10;
        this.size = this.capacity;
        this.end = 0;
    }

    @Override
    public void insert(char value){
        if (this.end < this.capacity){
            this.heap[this.end] = value;
            this.end += 1;
            insert(value, Math.floorDiv((heap[value] - 1), 2));
        }
        else{
            this.capacity = this.capacity + 10;
            char[] newdata = (char[]) new char[this.capacity];

            for (int i = 0; i < this.capacity; i++) {
                newdata[i] = this.heap[i];
            }
            this.heap = newdata;
            this.heap[this.end] = value;
            this.end += 1;
            insert(value, Math.floorDiv((heap[value] - 1), 2));
        }
    }

    private void insert(char value, int parent){
        if (value <= heap[parent]){
            return;
        }
        else{
            char temp = heap[parent];
            value = heap[parent];
            heap[parent] = temp;
            
            parent = Math.floorDiv((heap[value] - 1), 2);
            insert(value, parent);
        }
    }

    @Override
    public void delete(){
        char root = heap[0];
        heap[0] = heap[size - 1];
        size -=1;
        delete(0);
    }

    private void delete(int index){
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int largestIndex = index;

        if(leftChildIndex < size && heap[leftChildIndex] > heap[largestIndex]){
            largestIndex = leftChildIndex;
        }

        else if(rightChildIndex < size && heap[rightChildIndex] > heap[largestIndex]){
            largestIndex = rightChildIndex;
        }
        else{
            char temp = heap[index];
            heap[index] = heap[largestIndex];
            heap[largestIndex] = temp;

            delete(largestIndex);
        }
    }

    @Override
    public char peek(){
        return heap[0];
    }

    @Override
    public int size(){
        return this.end + 1;
    }

    @Override
    public boolean isEmpty(){
        return this.end == 0;
    }

    @Override
    public void clear(){
        while (isEmpty() == false){
            delete();
        }   
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < (this.end + 1); i++){
            string.append(heap[i]).append(" ");
        }
        return string.toString();
    }


}
