package csc223.tw;

import java.util.ArrayList;

public class MyHashTable extends Pair{
    int capacity;
    int size;
    ArrayList<Pair>[] buckets;

    public MyHashTable(){
        this.capacity = 50;
        this.size = 0;
        this.buckets = new ArrayList[this.capacity];

    }

    public void put(String key, int value){
        int index = Math.abs(key.hashCode()) % capacity;
        ArrayList<Pair> bucket = buckets[index];
        for (Pair pair : bucket){
            if (pair.key.equals(key));
            pair.value = value;
        }
        bucket.add(new Pair(key, value));
        this.size += 1;

    }

    public Integer get(String key){
        int index = Math.abs(key.hashCode()) % capacity;
        if (buckets[index] != null){
            ArrayList<Pair> bucket = buckets[index];
            for (Pair pair : bucket){
                if (pair.key.equals(key)){
                    return pair.value;
                }
            }
        }
        return null;
    }

    public void remove(String key){
        int index = Math.abs(key.hashCode()) % capacity;
        ArrayList<Pair> bucket = buckets[index];
        for (Pair pair : bucket){
            if (pair.key.equals(key)){
                bucket.remove(pair.value);
            }
        }
    }

    public boolean containsKey(String key){
        int index = Math.abs(key.hashCode()) % capacity;
        ArrayList<Pair> bucket = buckets[index];
        for (Pair pair : bucket){
            if (pair.key.equals(key)){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return this.size;
    }
}
