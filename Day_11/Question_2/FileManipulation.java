package Question_2;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class FileManipulation{
    private Scanner scanner;
    private File writeFile;
    private File readFile;

    public FileManipulation(File writeFile, File readFile) {
        this.writeFile = writeFile;
        this.readFile = readFile;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public File getWriteFile() {
        return writeFile;
    }

    public void setWriteFile(File writeFile) {
        this.writeFile = writeFile;
    }

    public File getReadFile() {
        return readFile;
    }

    public void setReadFile(File readFile) {
        this.readFile = readFile;
    }

    public void writeIntoAFile(File writeFile, boolean append) {
        try(FileWriter fw = new FileWriter(writeFile, append)) {
            IsFileExists(writeFile);
            System.out.println("Enter content to write into a writeFile: ");
            String content = readString();
            fw.write(content);
        } catch (IOException e) {
            System.out.println("Exception in writing into a writeFile " + e.getMessage());
        }
    }
    
    public void writeIntoAFile(File writeFile, boolean appends, String contents) {
        try(FileWriter fw = new FileWriter(writeFile, appends)) {
            IsFileExists(writeFile);
            fw.write(contents);
        } catch (IOException e) {
            System.out.println("Exception in writing into a writeFile " + e.getMessage());
        }
    }
    
    public int getWordCount(File file, String wordFromUser) {
        IsFileExists(file);
        String fileContents = readFromAFile(file);
        String[] words = fileContents.split(" ");
        int count = 0;
        for(String word : words)
            if(word.equals(wordFromUser))    count++;

        return count;
    }

    public String readFromAFile(File readFile) {
        StringBuilder sb = new StringBuilder();
        IsFileExists(readFile);
        try(FileInputStream fis = new FileInputStream(readFile)) {
            int data;
            while((data = fis.read()) != -1)
                sb.append((char) data);
        } catch (IOException e) {
            System.out.println("Exception in reading a file" + e.getMessage());
        }
        return sb.toString();
    }

    public void IsFileExists(File file)  {
        try {
            if(!file.exists()) {
                System.out.println(file.getName() + " doesnt exist........\nCreating " + file.getName() +  "File..........");
                if (file.createNewFile())
                    System.out.println("File created sucessfully");
            }
        } catch (IOException e) {
            System.out.println("IOException caught in validaing if the file exists" + file.getName());
        }
    }

    private String readString() {
        return scanner.nextLine();
    }
}
