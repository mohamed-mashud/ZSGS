// 4. Write a Java program to,
// a. create a new tree set, add some colours (string) and print out the tree set.
// b. iterate through all elements in a tree set.
// c. add all the elements of a specified tree set to another tree set.
// d. create a reverse order view of the elements contained in a given tree set.
// e. get the first and last elements in a tree set.
// f. clone a tree set list to another tree set.
// g. get the number of elements in a tree set.
// h. compare two tree sets.
//    Create a TreeSet that stores a set of numbers,
// i. find the numbers less than 7 in a tree set.
// j. get the element in a tree set which is greater than or equal to the given element.
// k. get the element in a tree set which is less than or equal to the given element.
// l. get the element in a tree set which is strictly greater than or equal to the given element.
// m. get an element in a tree set which is strictly less than the given element.
// n. retrieve and remove the first element of a tree set.
// o. retrieve and remove the last element of a tree set.
// p. remove a given element from a tree set.

import java.util.TreeSet;

public class Question_4 {
    public static void main(String[] args) {
        // a
        TreeSet<String> colorsTreeSet = new TreeSet<>();
        colorsTreeSet.add("Red");
        colorsTreeSet.add("Blue");
        colorsTreeSet.add("Orange");
        colorsTreeSet.add("Indigo");
        System.out.println(colorsTreeSet);

        // b
        for(String color : colorsTreeSet) {
            System.out.print(color + " ");
        }
        System.out.println();

        // c
        TreeSet<String> duplicateColorsTreeSet = new TreeSet<>();
        duplicateColorsTreeSet.addAll(colorsTreeSet);
        System.out.println(duplicateColorsTreeSet);

        // d
        TreeSet<String> reverseColorsTreeSet = new TreeSet<>(colorsTreeSet);
        System.out.println(reverseColorsTreeSet.descendingSet());

        // e
        System.out.println("First element: " + colorsTreeSet.first());
        System.out.println("Last element: " + colorsTreeSet.last());

        // f
        TreeSet<String> cloneColorsTreeSet = new TreeSet<>(colorsTreeSet);
        System.out.println(cloneColorsTreeSet);

        // g
        System.out.println("Number of elements: " + colorsTreeSet.size());

        // h
        System.out.println("is duplicateColorsTreeSet and colorsTreeSet equal ?" + duplicateColorsTreeSet.equals(colorsTreeSet));

        // i
        TreeSet<Integer> numTreeSet = new TreeSet<>();
        numTreeSet.add(10);
        numTreeSet.add(11);
        numTreeSet.add(7);
        numTreeSet.add(6);
        numTreeSet.add(5);

        for(Integer num : numTreeSet)
            if(num > 7)
                break;
            else
                System.out.print(num + " ");
        
        // j 
        System.out.print(numTreeSet.ceiling(2));
        
        // k       
        System.out.print(numTreeSet.floor(2));
        
        // l
        System.out.print(numTreeSet.lower(7));
        
        // m
        System.out.print(numTreeSet.higher(7));

        // n
        System.out.print(numTreeSet.pollFirst());

        // o
        System.out.print(numTreeSet.pollLast());

        // p
        System.out.println(numTreeSet.remove(11));
    }    
}
