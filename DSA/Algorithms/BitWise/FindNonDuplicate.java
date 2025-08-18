package DSA.Algorithms.BitWise;

public class FindNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 4}; // Example array with one non-duplicate
        int nonDuplicate = findNonDuplicate(arr);
        System.out.println("The non-duplicate element is: " + nonDuplicate);
    }

    public static int findNonDuplicate(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR operation to find the non-duplicate
        }
        return result;
    }
}
