package DataStructures.stack;
import DataStructures.lists.challengeOne.Employee;

import java.util.EmptyStackException;
import java.util.Iterator;

public class ArrayStack {

    private Employee stack[];
    private int top=-1;

    ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(top== stack.length){
            Employee newArray[] = new Employee[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack=newArray;
        }
        top++;
        stack[top] = employee;
    }
    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee popped = stack[top];
        stack[top--]=null;
        return popped;
    }
    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top];
    }
    public void printStack(){
        System.out.println("*******************");
        for (int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
        System.out.println("\n*******************");
    }
    public  boolean isEmpty(){
        return top==-1;
    }
}
