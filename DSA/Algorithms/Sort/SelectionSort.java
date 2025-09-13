package DSA.Algorithms.Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int last= arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            // Swap arr[maxIndex] and arr[last]
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }
    public static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
