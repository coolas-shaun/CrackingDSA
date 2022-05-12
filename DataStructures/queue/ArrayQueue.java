package DataStructures.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee emp){
        // checking if array is full, If it is full then we resize the array.
        if(back== queue.length){
            Employee[] newArray = new Employee[2* queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }
        queue[back] = emp;
        back++;
    }

    public Employee remove(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        Employee removedElement = queue[front];
        queue[front] = null;
        front++;
        if(size()==0){
            front = back = 0;
        }
        return removedElement;
    }

    public void peek(){
        System.out.println("Front element of the queue is:");
        if(size()==0)
                throw new NoSuchElementException();
        System.out.println(queue[front]);
    }

    public void printQueue(){
        System.out.println("Printing the queue: ");
        for (int i = front; i <back ; i++) {
            System.out.println(queue[i]);
        }
    }

    public int size(){
        return back-front;
    }
}
