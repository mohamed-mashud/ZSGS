//1. Write a Java program to read the contents of a text file and display it on the console.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Question_1 {
    public static void main(String[] args){
        File file = new File("Question_1.java");
        try(FileInputStream fis = new FileInputStream(file)) {
            int data;

            while((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}