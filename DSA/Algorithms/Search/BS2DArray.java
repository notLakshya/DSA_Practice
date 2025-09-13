package DSA.Algorithms.Search;

public class BS2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 10;
        boolean found = search2DArray(arr, target);
        System.out.println("Element " + target + " found: " + found);
    }
    public static boolean search2DArray(int[][] arr, int target) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return false; // Handle empty array case
        }

        int rows = arr.length;
        int cols = arr[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = arr[mid / cols][mid % cols];

            if (midValue == target) {
                return true; // Target found
            } else if (midValue < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return false; // Target not found
    }
}
