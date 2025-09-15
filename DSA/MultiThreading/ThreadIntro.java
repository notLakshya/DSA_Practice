package DSA.MultiThreading;

public class ThreadIntro {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        System.out.println("Current thread: " + Thread.currentThread().getName());

        newThread t1 = new newThread();
        t1.start(); // Start the new thread
    }
}
