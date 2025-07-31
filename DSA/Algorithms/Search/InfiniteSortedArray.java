package DSA.Algorithms.Search;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int target = 10;
        System.out.println("Target found at index: " + findPosition(arr, target));
    }

    public static int findPosition(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; // Return -1 if the array is empty or null
        }
        int start = 0;
        int end = 1;
        // Find the range where the target might be present
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1)*2; // Double the step size
            start = newStart; // Move start to the new position
        }
        return binarySearch(arr, start, end, target);
    }

    private static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2; // To prevent overflow

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
}
