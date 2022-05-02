package DataStructures.lists;

public class DoublyIntegerNode {
    private DoublyIntegerNode next;
    private DoublyIntegerNode prev;
    private int data;

    DoublyIntegerNode(int data){
        this.data = data;
    }

    public DoublyIntegerNode getNext() {
        return next;
    }

    public void setNext(DoublyIntegerNode next) {
        this.next = next;
    }

    public DoublyIntegerNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyIntegerNode prev) {
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
