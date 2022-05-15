package DataStructures.queue;

//import DataStructures.lists.challengeOne.EmployeeDoublyLinkedList;

import DataStructures.lists.challengeOne.EmployeeDoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        //ArrayQueue queue = new ArrayQueue(10);
        CircularQueue queue = new CircularQueue(5);

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.printQueue();
        System.out.println(queue.remove()+" removed");
        queue.peek();
        queue.add(billEnd);
        System.out.println(queue.remove()+" removed");
        System.out.println(queue.remove()+" removed");
        System.out.println(queue.remove()+" removed");
        System.out.println(queue.remove()+" removed");
        System.out.println(queue.remove()+" removed");

    }
}
