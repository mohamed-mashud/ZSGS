//7. Write a Java program to,
//1. associate the specified value with the specified key in a HashMap.
//2. count the number of key-value (size) mappings in a map.
//3. copy all of the mappings from the specified map to another map.
//4. remove all of the mappings from a map.
//5. check whether a map contains key-value mappings (empty) or not.
//6. get a shallow copy of a HashMap instance.
//7. test if a map contains a mapping for the specified key.
//8. test if a map contains a mapping for the specified value.
//9. create a set view of the mappings contained in a map.
//10. get the value of a specified key in a map.

import java.util.HashMap;
import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter the number of keyvalue pairs");
        int n = scanner.nextInt();
        int firstKeyFromUser = Integer.MIN_VALUE;
        int firstValueFromUser = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            System.out.println("Enter the key and value integers");
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if(firstKeyFromUser == Integer.MIN_VALUE)
                firstKeyFromUser = key;
            if(firstValueFromUser == Integer.MIN_VALUE)
                firstValueFromUser = value;

            map.put(key, value);
        }

//        2
        System.out.println("Count of number of key-value :" + map.size());
//        3
        HashMap<Integer, Integer> duplicateMap = new HashMap<>(map);

//        4
        map.clear();

//        5
        System.out.println("Is map empty? " + map.isEmpty());

//        6
        HashMap<Integer, Integer> shallowCopyMap = (HashMap<Integer, Integer>)duplicateMap.clone();
        System.out.println(shallowCopyMap);

//        7
        if(duplicateMap.containsKey(firstKeyFromUser))
            System.out.println("HashMap contains key: " + firstKeyFromUser);
        else
            System.out.println("HashMap doesnt contains key: " + firstKeyFromUser);

//        8
        if(duplicateMap.containsValue(firstValueFromUser))
            System.out.println("HashMap contains value: " + firstValueFromUser);
        else
            System.out.println("HashMap doesnt contains value: " + firstValueFromUser);

//        9
        System.out.println("Entry set: " + duplicateMap.entrySet());

//        10
        if(duplicateMap.containsKey(firstKeyFromUser))
            System.out.println("Value for the key " + firstKeyFromUser + "is " + duplicateMap.get(firstKeyFromUser));
        scanner.close();
    }
}