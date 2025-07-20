package DSA.Algorithms.Search;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; // Return -1 if the array is empty or null
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target value to search for:");
        int target = scanner.nextInt();
        scanner.close();
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }
}