// Write a Java program to append a text read from the user
// to an existing file without overwriting the original content.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Question_4 {
    public static void main(String[] args) {
        File file = new File("fileContentsQuestion_4.java");

        try(FileWriter fw = new FileWriter(file, true)) {
            if(!file.exists() && !file.createNewFile())     System.out.println("not created");;
            String content = "New content added to the existng file";
            fw.write(content);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}