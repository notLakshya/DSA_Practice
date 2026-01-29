package DSA.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Outer method acquired the lock");
            innerMethod(); // Call to another method that also requires the lock
        } finally {
            System.out.println("Outer method releasing the lock");
            lock.unlock();
        }
    }
    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner method acquired the lock");
            // Perform some operations
        } finally {
            System.out.println("Inner method releasing the lock");
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
