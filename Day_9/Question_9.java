// 9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.

// FileNotExcep extends IOException

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question_9 {
    public static void main(String[] args) {
        File file = new File("Question_0.java");
        try {
            FileReader fileReader = new FileReader(file);
            fileReader.close();
        } catch (FileNotFoundException f) {
            System.out.println("File not found " + f.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exiting......");
        }
        
    }
}