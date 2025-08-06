//4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times.
// Use synchronization to avoid race conditions and display the final value.

public class Question_4 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1_000; i++)
                counter.increment();
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1_000; i++)
                counter.increment();
        });
        Thread t3 = new Thread(() -> {
            for(int i = 0; i < 1_000; i++)
                counter.increment();
        });


        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Exception caught in joining the threads " + e.getMessage());
        }

        System.out.println("Counter value after thread execution : " + counter.getCount());
    }
}

class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
