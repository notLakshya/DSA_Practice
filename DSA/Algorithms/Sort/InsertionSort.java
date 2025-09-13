package DSA.Algorithms.Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void insertionSort(int[] arr){
        for(int i = 0; i< arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    // Swap arr[j] and arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break; // No need to swap, break the inner loop
                }
            }
        }
    }
}
