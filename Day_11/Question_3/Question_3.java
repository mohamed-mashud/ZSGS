package Question_3;//3. Write a Java program that reads a file and prints the number of lines, words, and characters.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question_3 {
    public static void main(String[] args) {
        String fileName = "Question_3/contentForQuestion_3.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();
                String[] parts = line.split(" ");
                wordCount += parts.length;
            }
        } catch(IOException f) {
            System.out.println(f.getMessage());
        }

        System.out.println(
                "lineCount : " + lineCount + " charCount : " + charCount + " wordCount :" + wordCount
        );
    }
}
