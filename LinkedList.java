


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

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            head.next = newNode;
            head = newNode;
        }
        length++;
    }
    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next!= null){
          pre = temp;
          temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
        
    }
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length==0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            
        }
        return temp;
    }
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.append(5);
        myLinkedList.append(8);
        myLinkedList.prepend(3);
        myLinkedList.prepend(11);

        //System.out.println(myLinkedList.removeLast().value);

        System.out.println(myLinkedList.get(1) + "\n");



        myLinkedList.PrintList();


    }
}