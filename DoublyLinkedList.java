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
    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        if(index < length/2){
            for(int i = 0; i<index; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i = length-1; i > index; i--){
                temp = temp.prev;
            }
        }

        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        while(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public Boolean insert(int index, int value){
        if(index < 0 || index >= length) return false;
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next; 
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
            newNode.prev = after.prev;
            after.prev = newNode;
            newNode.next = before.next;
            before.next = newNode;
            length++;
            return true;
    }   

    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return  removeFirst();
        if(index == length) return removeLast();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.prev = null;
        temp.next = null;
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

        // myLinkedList.removeLast();

        // myLinkedList.printList();
        // myLinkedList.prepend(10);
        // myLinkedList.removeFirst();
        // myLinkedList.printList();

        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(4));

        myLinkedList.insert(2, 11);

        myLinkedList.remove(3);
        myLinkedList.printList();


    }
    
}
