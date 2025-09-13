package DSA.Algorithms.BitWise;

public class OddEven {
    public static void main(String[] args) {
        int number = 5; // Example number
        if (isOdd(number)) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }
    }

    public static boolean isOdd(int num) {
        return (num & 1) == 1; // Check if the least significant bit is 1
    }
}
