//6. Write a Java program to,
//1. associate the specified value with the specified key in a Tree Map.
//2. copy a Tree Map content to another Tree Map.
//3. search a key in a Tree Map.
//4. search a value in a Tree Map.
//5. get all keys from the given a Tree Map.
//6. delete all elements from a given Tree Map.
//7. sort keys in Tree Map by using comparator.
//8. get a key-value mapping associated with the greatest key and the least key in a map.
//9. get the first (lowest) key and the last (highest) key currently in a map.
//10. get a reverse order view of the keys contained in a given map.

import java.util.*;
public class Question_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //        1
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(0,10);
        treeMap.put(1,20);
        treeMap.put(2,30);
        treeMap.put(3,40);
        System.out.println(treeMap);
//        2
        TreeMap<Integer, Integer> duplicateTreeMap = new TreeMap<>(treeMap);
        System.out.println(duplicateTreeMap);

//        3
        System.out.println("Enter key to search: ");
        int keyToSearch = scanner.nextInt();

        if(treeMap.containsKey(keyToSearch))
            System.out.println("Key found");
        else
            System.out.println("Key not found");

//        4
        System.out.println("Enter value to search: ");
        int valueToSearch = scanner.nextInt();

        if(treeMap.containsValue(valueToSearch))
            System.out.println("Value found");
        else
            System.out.println("Value not found");

//        5
        System.out.println(treeMap.keySet());

//        6
        treeMap.clear();

//        7
        TreeMap<Integer, Integer> customTreeMap = new TreeMap<>(new CustomSort());
        System.out.println(customTreeMap);
        //        8
        Map.Entry<Integer,Integer> leastEntry = treeMap.firstEntry();   // Smallest key
        Map.Entry<Integer,Integer> greatestEntry = treeMap.lastEntry(); // Largest key

//        9
        Integer firstKey = treeMap.firstKey();
        Integer lastKey = treeMap.lastKey();

//        10
        NavigableSet<Integer> reverseKeys = treeMap.descendingKeySet();
    }
}

class CustomSort implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}