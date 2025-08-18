package DSA.Algorithms.Sort;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2};
        cyclicSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Calculate the correct index for the current element
            if(arr[i] != arr[correctIndex]) {
                // Swap arr[i] and arr[correctIndex]
                 int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++; // Move to the next element if the current element is in the correct position
            }
        }
    }
}
