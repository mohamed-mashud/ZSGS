//2. Write a Menu driven Java program
// a) to read content from the user and write it into another writeFile and
// b) from the writeFile to another writeFile
// c) to modify the content of a writeFile
// d) to search for a particular word in a writeFile and display how many times it appears
// e) read the content(List of Electronic Products) of a .txt writeFile and copy them to the .csv writeFile.

import java.io.File;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File csvFile = new File("csvFile.csv");

        Scanner scanner = new Scanner(System.in);
        FileManipulation fileManipulation = new FileManipulation(file1, file2);
        fileManipulation.setScanner(scanner);
        try {
            // a
            fileManipulation.writeIntoAFile(file1, false);
            // b
            String fileContents = fileManipulation.readFromAFile(file1);
            fileManipulation.writeIntoAFile(file2, true, fileContents);

            // c
            fileManipulation.writeIntoAFile(file2, true);

            // d
            System.out.println("Enter word to search in the file: ");
            String wordFromUser = scanner.nextLine();
            int wordCount = fileManipulation.getWordCount(file2, wordFromUser);
            System.out.println(wordFromUser + " appreared " + wordCount + " times");

            //e
            String electronicProducts = fileManipulation.readFromAFile(new File("ElectronicProducts.txt"));
            fileManipulation.writeIntoAFile(csvFile, false, electronicProducts);

            String fromCSV = fileManipulation.readFromAFile(csvFile);
            System.out.println(fromCSV);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

