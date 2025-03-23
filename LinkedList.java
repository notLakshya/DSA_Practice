


public class LinkedList {
    private class Node {
     int value;
     Node next;

     Node(int value){
        this.value = value;
     }
    }
    private Node head;
    private Node tail;
    int length;

    public LinkedList(int value){
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

    public void PrintList() {
        Node temp = head;
        System.out.println("List Starting:");
        while(temp!=null){
           System.out.println(temp.value);
           temp = temp.next;
        }
        System.out.println("List Ended");
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
           head = newNode;
           tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.PrintList();
        myLinkedList.append(5);
        myLinkedList.PrintList();
    }
}