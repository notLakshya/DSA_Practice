package DSA.MultiThreading;

public class newThread extends Thread{
    @Override
    public void run() {
        for (; ;){
            System.out.println("New thread is running: " + Thread.currentThread().getName());
        }
    }

}
