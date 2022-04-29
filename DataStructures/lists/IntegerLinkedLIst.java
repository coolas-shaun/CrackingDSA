package DataStructures.lists;

public class IntegerLinkedLIst {
    private  IntegerNode head;
    private int size;

    public void addToFront(int data){
        IntegerNode node = new IntegerNode(data);
        node.setNext(head);
        head = node;
        size++;
    }
    public IntegerNode removeFromFront(){
        if(isEmpty())
            return null;
        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }
    public void printList(){
        IntegerNode current = head;
        System.out.print("HEAD-->");
        while(current!=null){
            System.out.print(current.getData());
            System.out.print("-->");
            current = current.getNext();
        }
        System.out.print("NULL");
        System.out.println("f");
    }

    public boolean isEmpty(){
        return head==null;
    }
}
