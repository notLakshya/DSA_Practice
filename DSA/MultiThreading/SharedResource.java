package DSA.MultiThreading;

public class SharedResource {
    private boolean hasData;
    private int data;

    public void produce(int value) {
        synchronized (this) {
            while (hasData) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            data = value;
            hasData = true;
            System.out.println("Produced: " + value);
            notifyAll();
        }
    }
    public synchronized int consume() {
            while (!hasData) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Consumed: " + data);
            hasData = false;
            notifyAll();
        return data;
    }
    class producer implements Runnable{
        private SharedResource resource;
        public producer(SharedResource resource) {
            this.resource = resource;
        }
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                resource.produce(i);
                try {
                    Thread.sleep(100); // Simulate time taken to produce
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    class consumer implements Runnable{
        private SharedResource resource;
        public consumer(SharedResource resource) {
            this.resource = resource;
        }
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                resource.consume();
                try {
                    Thread.sleep(150); // Simulate time taken to consume
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(resource.new producer(resource));
        Thread consumerThread = new Thread(resource.new consumer(resource));
        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Production and Consumption completed.");
    }
}
