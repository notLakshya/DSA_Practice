package DSA.Algorithms.Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }
    public static int binarySearch(int[] arr, int target) {
        if(arr == null || arr.length == 0) {
            return -1; // Return -1 if the array is empty or null
        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // To prevent overflow

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else if(arr[mid] > target) {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
}
