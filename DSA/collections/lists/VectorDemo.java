package DSA.collections.lists;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        // Vector example code would go here
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector elements: " + vector);
        System.out.println("Vector size: " + vector.size());
        System.out.println("Vector capacity: " + vector.capacity());
    }
}