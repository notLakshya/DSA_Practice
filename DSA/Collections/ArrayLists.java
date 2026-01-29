package DSA.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    
    public static void main(String[] args) {
        // Creating an instance of ArrayList
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<String> stringList = Arrays.asList("Apple", "Banana", "Cherry");
        //Immutable list- these cannot be modified, added to, or removed from after creation
        // you need to create a new list if you want to change it.
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        // Adding elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);

        // Accessing elements from the ArrayList
        System.out.println("First element: " + arrayList.get(0));
        for (String fruit : stringList) {
            System.out.println("Fruit: " + fruit);
        }
        for (Double num : doubleList) {
            System.out.println("Number: " + num);
        }
        // Displaying the size of the ArrayList
        System.out.println("Size of arrayList: " + arrayList.size());
        // difference between size and capacity in ArrayList
        // Size is the number of elements currently in the list, 
        // while capacity is the total number of elements the list can hold before needing to resize.
        arrayList.trimToSize();
        list.addAll(arrayList);
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
    }
}
