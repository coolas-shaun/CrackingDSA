package DataStructures.queue;

import java.util.NoSuchElementException;

public class CircularQueue {
    private Employee[] queue;
    private int front;
    private int back;

    CircularQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee emp){
        // checking if array is full, If it is full then we resize the array.
        if(size()== queue.length-1){
            int numItems = size();
            Employee[] newArray = new Employee[2* queue.length];
            System.arraycopy(queue,front,newArray,0,queue.length-front);
            System.arraycopy(queue,0,newArray,queue.length-front,back);
            queue = newArray;
            front = 0;
            back = numItems;
        }
        queue[back] = emp;
        if(back< queue.length-1)
            back++;
        else
            back = 0;
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
        if(back>=front)
            return back-front;
        else
            return back-front+ queue.length;
    }
}

