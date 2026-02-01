package collections.maps;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        // HashTable implementation demo
        System.out.println("HashTable example code would go here");
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        Thread thread = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                hashtable.put(i, "Value" + i);
                System.out.println("Inserted: " + i + " -> " + "Value" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}