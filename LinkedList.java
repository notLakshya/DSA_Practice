




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
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            
        }
        return temp;
    }

    public Boolean set(int index, int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
    return false;
    }

    public Boolean insert(int index, int value){

        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
            Node temp = get(index-1);
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        
    }

    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return  removeFirst();
        if(index == length) return removeLast();

        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;

        //Alternate to improve space complexity
        // Node prev = get(index-1);
        // prev.next = prev.next.next;
        // prev.next.next = null;
        length--;

        return temp;
    }

    public void reverse(){
     Node temp = head;
     head = tail;
     tail = temp;
     Node after = temp.next;
     Node before = null;

     for(int i = 0; i<length; i++){
        after = temp.next;
        temp.next = before;
        before = temp;
        temp = after;

     }

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

        System.out.println(myLinkedList.set(1, 4) + "\n");

        //myLinkedList.remove(2);
        myLinkedList.PrintList();

        myLinkedList.reverse();



        myLinkedList.PrintList();


    }
}