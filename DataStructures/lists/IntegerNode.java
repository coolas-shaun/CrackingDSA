package DataStructures.lists;

public class IntegerNode {
    private IntegerNode next;
    private int data;

    IntegerNode(int data){
        this.data = data;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
