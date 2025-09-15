package DSA.MultiThreading;

public class ThreadLifeCycle extends Thread {
    public void run() {
        System.out.println("Thread is in running state");
        try {
            Thread.sleep(2000); // Simulate some work with sleep
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ThreadLifeCycle t1 = new ThreadLifeCycle();
        System.out.println("Thread state after creation: " + t1.getState()); // NEW state
        t1.start();
        System.out.println("Thread state after calling start(): " + t1.getState()); // RUNNABLE state
        try {
            Thread.sleep(500); // Wait for a moment to let the thread start
            System.out.println("Thread state while running: " + t1.getState()); // TIMED_WAITING or RUNNABLE state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state after completion: " + t1.getState()); // TERMINATED state
    }
}
