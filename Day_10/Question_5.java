//5. Write a Java program to,
//1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
//2. iterate through all elements in priority queue.
//3. add all the elements of a priority queue to another priority queue.
//4. insert a given element into a priority queue.
//5. remove all the elements from a priority queue.
//6. count the number of elements in a priority queue.
//7. compare two priority queues.
//8. retrieve the first element of the priority queue.
//9. retrieve and remove the first element.
//10. convert a priority queue to an array containing all of the elements of the queue.
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //        1
        PriorityQueue<String> colorsPriorityQueue = new PriorityQueue<>();
        colorsPriorityQueue.add("Red");
        colorsPriorityQueue.add("Yellow");
        colorsPriorityQueue.add("Black");
        colorsPriorityQueue.add("white");
        //2
        for(String color: colorsPriorityQueue)
            System.out.print(color + ' ');

//        3
        PriorityQueue<String> duplicateColors = new PriorityQueue<>(colorsPriorityQueue);

//        4
        System.out.println("Enter an element: ");
        String element = scanner.nextLine();
        colorsPriorityQueue.add(element);
        System.out.println(colorsPriorityQueue);

//        5
        colorsPriorityQueue.clear();
//        6
        System.out.println(colorsPriorityQueue.size());

//        7
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("10");
        pq.add("1121");
        pq.add("1123");
        pq.add("12314");
        System.out.println("is pq and colorsPriorityQueue ?:" + pq.equals(colorsPriorityQueue));

//        8
        System.out.println("Pq first element" + pq.peek());

//        9
        System.out.println("pq retrieve and remove the first element" +  pq.poll());

//        10
        ArrayList<String> list = new ArrayList<>(pq);
        System.out.println(list);
    }
}
