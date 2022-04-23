package DataStructures.listImplementation.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeArrayList {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        addItem(employee,"John","Doe",207);
        addItem(employee,"Mary","Smith",208);
        addItem(employee,"Wilson","Fisk",203);

        printList(employee);

        printID(employee,1);
    }


    public static void addItem(List employee, String fname, String lname, int id){
        employee.add(new Employee(fname, lname,id));
    }

    public  static void printList(List employee){
        Iterator itr = employee.iterator();
        while(itr.hasNext()){
            Object emp = itr.next();
            System.out.println(emp);
        }
    }
    public static void printID(List employee, int index){
        Employee emp =  (Employee) employee.get(index);

        System.out.println("\n\nEmployee ID:");
        System.out.println(emp.getId());
    }
}
