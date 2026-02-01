package DSA.collections.lists;

import java.util.LinkedList;

public class LinkedLists {
    
    public static void main(String[] args) {
        // LinkedList example code would go here
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Size of LinkedList: " + list.size());
    }
}
