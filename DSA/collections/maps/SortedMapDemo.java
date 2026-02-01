package DSA.collections.maps;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        // SortedMap implementation example
        System.out.println("SortedMap example code would go here");
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(3, "Three");
        sortedMap.put(1, "One");
        sortedMap.put(2, "Two");
        System.out.println("SortedMap elements: " + sortedMap);
        System.out.println("HeadMap (exclusive of 3): " + sortedMap.headMap(3));

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.putAll(sortedMap);
        System.out.println("NavigableMap elements: " + navigableMap);
        System.out.println("Lower entry than 2: " + navigableMap.lowerEntry(2));
        System.out.println("Ceiling entry for 2: " + navigableMap.ceilingEntry(2));
        
    }
}