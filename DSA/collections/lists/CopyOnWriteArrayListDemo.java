package DSA.collections.lists;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    
    public static void main(String[] args) {
        // CopyOnWriteArrayList example code would go here
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("CopyOnWriteArrayList elements: " + list);

        for (String s : list) {
            System.out.println("Element: " + s);
            list.add("D"); // This won't affect the current iteration
        }
        System.out.println("Final CopyOnWriteArrayList elements: " + list);

    }
}
