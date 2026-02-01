package DSA.collections.maps;

import java.util.Map;

public class HashMapsExample {
    public static void main(String[] args) {
        
        Map<Integer, String> hashMap = new java.util.HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");  
        hashMap.put(3, "Three");
        System.out.println("HashMap contents: " + hashMap);
        System.out.println("Value for key 2: " + hashMap.get(2));
        System.out.println("HashMap size: " + hashMap.size());
    }
}
