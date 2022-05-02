package DataStructures.lists;

public class DoublyLinkedList {
    private DoublyIntegerNode head;
    private DoublyIntegerNode tail;
    private int size;

    public void addFromFront(int data){
        DoublyIntegerNode node = new DoublyIntegerNode(data);
        node.setNext(head);
        if(head==null){
            tail = node;
        }
        else{
            head.setPrev(node);
        }
        head = node;
        size++;
    }

    public void addFromEnd(int data){
        DoublyIntegerNode node = new DoublyIntegerNode(data);
        node.setPrev(tail);
        if(tail==null){
            head = node;
        }
        else{
            tail.setNext(node);
        }
        tail = node;
        size++;
    }
    public DoublyIntegerNode removeFromFront(){
        if(head==null){
            return null;
        }
        DoublyIntegerNode removedNode = head;
        if(head.getNext()==null){
            tail = null;
        }
        else{
            head.getNext().setPrev(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public DoublyIntegerNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }
        DoublyIntegerNode removedNode = tail;
        if(tail.getPrev()==null){
            head=null;
        }
        else {
            tail.getPrev().setNext(null);
        }
        tail = tail.getPrev();
        size--;
        removedNode.setPrev(null);
        return removedNode;
    }

    public void printList(){
        DoublyIntegerNode current = head;
        System.out.print("NULL<-");
        while(current!=null){
            System.out.print(current.getData()+"<=>");
            current = current.getNext();
        }
        System.out.print("->NULL");
        System.out.println("");
    }

    public boolean isEmpty(){
        return head==null;
    }
}
