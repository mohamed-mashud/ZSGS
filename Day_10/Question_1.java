// 1. Write a Java program
// a. to create a new array list, add some colours (string) and print out the collection.
// b. to iterate through all elements in an array list.
// c. to insert an element into the array list at the first position.
// d. to retrieve an element (at a specified index) from a given array list.
// e. to update specific array element by given element.
// f. to remove the third element from an array list.
// g. to search an element in an array list.
// h. to sort a given array list.
// i. to copy one array list into another.
// j. to shuffle elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Question_1 {
    public static void main(String[] args) {
        // a 
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // b
        for(String color : colors) 
            System.out.print(color + " ");

        // c
        colors.addFirst("Indigo");
        System.out.println(colors);

        // d
        int randomIndex = (int) (Math.random() * colors.size())  % colors.size();
        System.out.println("Color at randomIndex " + randomIndex + "is " + colors.get(randomIndex));

        // e
        colors.set(0, "Orange");
        System.out.println(colors);

        // f
        colors.remove(3);
        System.out.println(colors);

        // g
        System.out.println("Colors contains red ? : " + colors.contains("Red"));

        // h
        Collections.sort(colors);
        System.out.println(colors);

        // i
        ArrayList<String> duplicateColors = new ArrayList<>(colors);
        System.out.println(duplicateColors);

        // j
        Collections.shuffle(colors);
        System.out.println(colors);
    }    
}
