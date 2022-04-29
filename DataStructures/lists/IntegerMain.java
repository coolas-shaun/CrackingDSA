package DataStructures.lists;

public class IntegerMain {
    public static void main(String[] args) {
        IntegerLinkedLIst list = new IntegerLinkedLIst();
        list.addToFront(10);
        list.addToFront(20);
        list.printList();
        list.removeFromFront();
        list.printList();
    }
}
