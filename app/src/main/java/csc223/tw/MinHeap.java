package csc223.tw;

public  class MinHeap implements Heap  {

    char [] minHeap;
    int capacity = 10;
    int size;
    
    public MinHeap(){
        this.minHeap = new char[this.capacity];
        this.size = 0; 
        
    }
    // Insert an item to the heap
    


    @Override
    public void insert(char value){
        if(this.size == minHeap.length){
            resize();
        }
        minHeap[this.size] = value;
        this.size++;
        insert(this.size -1);
    }

    private void insert (int loc){
        if (loc <= 0){
            return;
        }
        int parent = (loc -1 )/2;
        if(minHeap[loc] < minHeap[parent]){
            char temp = minHeap[loc];
            minHeap[loc] = minHeap[parent];
            minHeap[parent] = temp;
            insert(parent);
        }
    }

    // Delete the root element from the heap
    @Override
    public void delete(){
        if(isEmpty()){
            return;
        }
        minHeap[0] = minHeap[this.size -1];
        this.size--;
        delete(0);

    }

    private void delete(int loc){
        int leftChild = loc * 2 + 1;
        int rightChild = loc *2 +2;

        if(leftChild >= this.size){
            return;
        }

        int smallChild = leftChild;
        if (rightChild < this.size && minHeap[rightChild]< minHeap[leftChild]){
            smallChild = rightChild;
        }

        if(minHeap[loc] <= minHeap[smallChild]){
            return;
        }
        char temp = minHeap[loc];
        minHeap[loc]= minHeap[smallChild];
        minHeap[smallChild] = temp;

        delete(smallChild);
    }

    // Get the root element of the heap
    @Override
    public char peek(){
        return this.minHeap[0];

    }

    // Get the size of the heap
    @Override
    public int size(){
        return this.size;
    }

    // Check if the heap is empty
    @Override
    public boolean isEmpty(){
        return this.size == 0;
    }

    // Clear the heap
    @Override
    public void clear(){
        minHeap = new char[this.capacity];
        this.size = 0;
    }

    // Return a string representation of all elements in the heap
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < this.size; i++){
            sb.append(minHeap[i]);
            if(i < this.size -1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private void resize(){
        char[] newHeap = new char[minHeap.length * 2];
        System.arraycopy(minHeap, 0, newHeap, 0, minHeap.length);
        minHeap = newHeap;
    }
    
}
