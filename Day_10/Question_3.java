// 3. Write a Java program to,
// a. append the specified element to the end of a hash set.
// b. iterate through all elements in a hash list.
// c. get the number of elements in a hash set.
// d. empty the hash set.
// e. test a hash set is empty or not.
// f. clone a hash set to another hash set.
// g. convert a hash set to an array.
// h. convert a hash set to a tree set.
// i. convert a hash set to a List/ArrayList.
// j. compare two hash set.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Question_3 {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        // a
        hashSet.add(10);

        // b
        for (Integer i : hashSet) 
            System.out.println(i);
        
        // c
        System.out.println("Number of elements in the hashSet: " + hashSet.size());

        // d
        hashSet.clear();

        // e
        System.out.println("Is the hashSet empty? " + hashSet.isEmpty());

        // f
        HashSet<Integer> set2 = new HashSet<>(hashSet);
        System.out.println("Cloned hashSet: " + set2);

        // g
        Integer[] array = set2.toArray(new Integer[hashSet.size() - 1]);

        // h
        Set<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);

        // i
        ArrayList<Integer> list = new ArrayList<>(hashSet);
        System.out.println(list);

        // j
        System.out.println("Is the hashSet equal to set2? " + hashSet.equals(set2));
    } 
}
