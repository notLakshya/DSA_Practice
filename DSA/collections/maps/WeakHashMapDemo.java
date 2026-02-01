package DSA.collections.maps;

import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    
    public static void main(String[] args) {
        // WeakHashMap example code would go here
        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>(); 
        WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(1, "One");
        weakHashMap.put(2, "Two");
        weakHashMap.put(3, "Three");
        System.out.println("WeakHashMap elements: " + weakHashMap);
        try {
            Thread.sleep(10000); // Pause to allow garbage collection
        } catch (InterruptedException e) {
            e.printStackTrace();
    }
        System.gc(); // Suggest garbage collection
        System.out.println("WeakHashMap after GC: " + weakHashMap);
    }
}
