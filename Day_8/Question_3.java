// 3. Develop a Java program which illustrates the usage of 
// Comparable Interface.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_3 {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("John", 12));
        studentsList.add(new Student("Don", 32));
        studentsList.add(new Student("Kong", 22));
        studentsList.add(new Student("King", 42));
        studentsList.add(new Student("Joanne", 60));

        Collections.sort(studentsList);
        
        for (Student student : studentsList) {
            System.out.println(student.toString());
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.age, that.age);
    }
}
