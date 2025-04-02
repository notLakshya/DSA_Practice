public class DoublyLinkedList {

    private class Node {
        int value;
        Node next;
        Node prev;
   
        Node(int value){
           this.value = value;
        }
       }
       private Node head;
       private Node tail;
       int length;
       public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public Node getHead(){
        System.out.println("Head: " + head.value);
        return head;
    }

    public Node getTail(){
        System.out.println("Tail: " + tail.value);
        return tail;
    }

    public int getLength(){
        System.out.println("length: "+ length);
        return length;
    }
    
}
