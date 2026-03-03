package DataStructures.arrays;

public class Hashing {
    public static void main(String[] args) {
        System.out.println("Hashing implementation");
        int[] arr = {0, 1, 2, 3, 4, 5, 0, 0, 6, 7};
        System.out.println("Count of 5 in the array:" + hash(arr, 5));
        String[] strArr = {"a", "b", "c", "a", "d", "e", "b"};
        System.out.println("Count of 'a' in the array:" + charHash(strArr, "a"));

    }

    private  static int hash(int[] arr, int target) {
        int[] hashTable = new int[10];
        for( int num: arr){
            hashTable[num]++;
        }
        return hashTable[target]; // Return the count of target in the array
    }

     private static int charHash(String[] arr, String target) {
        int[] hashTable = new int[26]; // Assuming only lowercase letters
        for( String str: arr){
                hashTable[str.charAt(0) - 'a']++; // Increment count for each character
        }
        return hashTable[target.charAt(0) - 'a']; // Return the count of target in the array
    }
}
