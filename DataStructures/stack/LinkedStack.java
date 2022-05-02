package DataStructures.stack;

import DataStructures.lists.challengeOne.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack {
    private LinkedList<Employee> stack;

    LinkedStack(){
        stack = new LinkedList<>();
    }
    public  void push(Employee employee){
        stack.push(employee);
    }
    public Employee peek(){
        return stack.peek();
    }
    public Employee pop(){
        return stack.pop();
    }
    public void printStack(){
        Iterator itr = stack.iterator();
        System.out.println("***************");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("***************");
    }
}
