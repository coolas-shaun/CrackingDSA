package DataStructures.hashTable;

public class Main {
    public static void main(String[] args) {
        SimpleHashTable ht = new SimpleHashTable();
        ht.put("John", new Employee("Doe","John",2));
        ht.put("Kelly", new Employee("Simons","Kelly",1));
        //System.out.println(ht.get("Kelly"));
        ht.put("Wilson", new Employee("Mike","Wilson",3));
        ht.printHashTable();
    }
}
