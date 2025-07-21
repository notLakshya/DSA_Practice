package DSA.Algorithms.Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 4, 2, 0};
        int target = 6;
        int result = orderAgnosticBinarySearch(arr, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; // Return -1 if the array is empty or null
        }
        int left = 0;
        int right = arr.length - 1;

        // Determine if the array is sorted in ascending or descending order
        boolean isAscending = arr[left] < arr[right];

        while (left <= right) {
            int mid = left + (right - left) / 2; // To prevent overflow

            if (arr[mid] == target) {
                return mid; // Target found
            }

            if (isAscending) {
                if (arr[mid] < target) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            } else {
                if (arr[mid] > target) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
        }
        return -1; // Target not found
    }
}
