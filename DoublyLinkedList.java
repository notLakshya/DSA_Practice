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

    public void printList(){
        Node temp = head;

        System.out.println("Printing the DLL: ");

        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        length++;
    }
    public Node removeLast(){

        if(length == 0) return null;
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        } else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head.next;
        if(length == 1){
            head = null;
            tail = null;
        }else{
          temp.prev = null;
          head.next = null;
          head = temp;
        }
        length--;

        return temp;

    }

    public static void main(String[] args) {
        DoublyLinkedList myLinkedList = new DoublyLinkedList(4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.append(2);
        myLinkedList.append(12);
        myLinkedList.append(33);
        myLinkedList.append(8);

        myLinkedList.removeLast();

        myLinkedList.printList();
        myLinkedList.prepend(10);
        myLinkedList.removeFirst();
        myLinkedList.printList();


    }
    
}
