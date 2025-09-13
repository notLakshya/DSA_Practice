package DSA.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Using streams to partition the list into even and odd numbers
        Map<Boolean, List<Integer>> partitionedList = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(partitionedList);
        // Using streams to filter even numbers and print them
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        // Given a sentence, use streams to find the frequency of each character.
        String text = "asffd fdf dg gdhdfvbtevt tt";
        Map<Character, Long> freq =  text.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freq);

        // Merging two arrays and removing duplicates using streams
        int[] arr1 = {1, 2, 3, 2, 1, 4, 4};
        int[] arr2 = {5, 6, 7, 5, 6, 8, 8, 9, 9};

        int[] mergedArr = Arrays.stream(new int[][]{arr1, arr2}).flatMapToInt(Arrays::stream).distinct().sorted().toArray();
        System.out.println(Arrays.toString(mergedArr));
    }
}
