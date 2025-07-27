// 9. Write an array which takes in roll no and marks in 3
// subjects for 10 students. Format and Print the roll no,
// total marks and average for all students in a table form.
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        int n = 10;
        Student[] students = new Student[n];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Roll No and 3 subject marks for 10 students:");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            int[] marks = new int[3];

            System.out.print("Enter marks for 3 subjects: ");
            for (int j = 0; j < 3; j++)
                marks[j] = scanner.nextInt();

            students[i] = new Student(rollNo, marks);
        }

        scanner.close();

        // Print header for report
        System.out.printf("\n%-10s %-15s %-15s\n", "Roll No", "Total Marks", "Average Marks");
        System.out.println("--------------------------------------------------");

        // Print results for all students
        for (Student s : students) {
            System.out.printf("%-10d %-15d %-15.2f\n", 
                              s.rollNo, s.getTotalMarks(), s.getAverageMarks());
        }
    }
}

class Student {
    int rollNo;
    int[] marks = new int[3];

    public Student(int rollNo, int[] marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int getTotalMarks() {
        int sum = 0;
        for (int mark : marks)
            sum += mark;
        return sum;
    }

    public double getAverageMarks() {
        return (double) getTotalMarks() / marks.length;
    }
}

/*
 * 
 * Example inputs 
101 87 92 78
102 69 75 80
103 90 88 94
104 55 67 60
105 78 82 79
106 99 95 93
107 84 73 81
108 60 62 58
109 89 91 90
110 70 80 75
 * 
 */