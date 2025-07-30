// 2. Develop a Java program which illustrates the usage of Comparator Interface.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question_2 {
    public static void main(String[] args) {

        // comparator compares the length of the String
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        };

        List<String> stringList = new ArrayList<>();

        stringList.add("Value");
        stringList.add("of");
        stringList.add("various");
        stringList.add("length");

        Collections.sort(stringList, comparator);
        System.out.println(stringList);
        /*  Output:
         * [of, Value, length, various]
         */
    }   
}