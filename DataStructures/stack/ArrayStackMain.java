package DataStructures.stack;

import DataStructures.lists.challengeOne.Employee;

public class ArrayStackMain {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("John","Doe",1));
        stack.push(new Employee("Mary", "Smith", 2));
        stack.push(new Employee("Mike", "Wilson", 3));
        stack.push(new Employee("Bill", "End", 4));
        stack.push(new Employee("Jane", "Jones", 5));

        stack.printStack();
        System.out.println("Popped element:"+stack.pop());
        System.out.println("Top element:"+ stack.peek());
        stack.printStack();

    }
}
