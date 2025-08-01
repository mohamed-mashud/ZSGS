// 2. Write a Java program to,
// a. append the specified element to the end of a linked list.
// b. iterate through all elements in a linked list.
// c. iterate through all elements in a linked list starting at the specified position.
// d. iterate a linked list in reverse order.
// e. insert the specified element at the specified position in the linked list.
// f. insert elements into the linked list at the first and last position.
// g. insert the specified element at the front of a linked list.
// h. insert the specified element at the end of a linked list.
// i. insert some elements at the specified position into a linked list.
// j. get the first and last occurrence of the specified elements in a linked list.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        // a
        list.add(10);
        list.add(1012);
        list.add(1212);
        list.add(110);
        list.add(13420);

        // B
        for (Integer integer : list) {
            System.out.println(integer);
        }

        // c
        int pos = (int) (Math.random() * list.size()) % list.size();
        System.out.println("Position: " + pos);

        for(int i = pos; i < list.size(); i++) 
            System.out.print(list.get(i) + " ");
        System.out.println();
        
        // d
        for(int i = list.size() - 1; i >= 0; i--) 
            System.out.print(list.get(i) + " ");
        System.out.println();

        // e
        System.out.print("Enter index to add integer from 0 to " + list.size() + ": ");
        int index = scanner.nextInt();
        System.out.println("Enter the element");
        list.add(index, 100);
        System.out.println(list);

        // f
        list.addFirst(1);
        list.addLast(10231);
        System.out.println(list);

        // g
        list.addFirst(0);
        System.out.println(list);


        //h
        list.addFirst(10100101);
        System.out.println(list);

        // i
        list.add(index, 100);
        list.add(list.size() - 1, 99);
        System.out.println(list);

        // j
        System.out.println("Get first index of 100" + list.indexOf(100));
        System.out.println("Get lsat index of 100" + list.lastIndexOf(100));

        scanner.close();
    }
}
