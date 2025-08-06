//2. Write a Java program to create a thread using the Runnable interface.
//--->Create a class TaskRunner that implements Runnable.
//--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
//--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
//--->The console should reflect the concurrent execution of both tasks.

public class Question_2 {
    public static void main(String[] args) {
        TaskRunner task1 = new TaskRunner();
        TaskRunner task2 = new TaskRunner();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}

class TaskRunner implements Runnable {
    @Override
    public void run() {
        try {
            long sleepTime = 1_000;
            for(int i = 0; i < 10; i++) {
                System.out.println(
                        "Current Thread : " + Thread.currentThread().getName() +
                        " 'The message will print in the duration of " +
                        (sleepTime / 1_000) + " second' "
                );
                Thread.sleep(sleepTime);
            }
        } catch(InterruptedException e) {
            System.out.println("Exception caught in running" + getClass() + " in " + Thread.currentThread().getName());
        }
    }
}