//3. Write a Java program where one thread prints only even numbers and
// another prints only odd numbers from 1 to 20.
// Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).


// wait() and notify() method and set common counter variable in a separate class
// make it such that oddmethod and even method are present in a single class

public class Question_3 {
    public static void main(String[] args) {
        Print print = new Print();
        print.setLimit(20);

        Thread t1 = new Thread(() -> {
            print.printOddNumbers();
        });

        Thread t2 = new Thread(() -> {
            print.printEvenNumbers();
        });

        t1.setName("Odd thread");
        t1.setName("Even thread");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Exception caught in joining the threads : " + e.getMessage());
        }
    }
}

class Print {
    private static int limit;
    volatile static int counter = 1;

    public void setLimit(int limit) {
        Print.limit = limit;
    }

    public synchronized void printEvenNumbers() {
        while(counter <= limit) {
            if(counter % 2 == 0) {
                System.out.print(counter + " ");
                counter++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void printOddNumbers() {
        while(counter <= limit) {
            if(counter % 2 == 1) {
                System.out.print(counter + " ");
                counter++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


