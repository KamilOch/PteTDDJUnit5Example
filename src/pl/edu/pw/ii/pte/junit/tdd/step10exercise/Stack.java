package pl.edu.pw.ii.pte.junit.tdd.step10exercise;

import java.nio.BufferOverflowException;
import java.util.EmptyStackException;

public class Stack {

    public int capacity = 10;
    private int size = 0;
    private int[] contents = new int[capacity];


    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int i) {
        if (size == capacity) {
            //throw new BufferOverflowException();
            increaseCapacityBy(capacity/2);

        }
        contents[size++] = i;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return contents[--size];
    }

    // MOJA PRACA DOMOWA

    public int getSize() {
        return size;
    }

    public void clear() {
        size = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void increaseCapacityBy(int increaseValue) {
    	capacity += increaseValue;
        int[] newContents = new int[capacity];

		for (int i = 0; i<size; i++){
			newContents[i]=contents[i];
		}
        contents = newContents;
    }




}
