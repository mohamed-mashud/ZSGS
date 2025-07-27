// 7. Use both if and switch case statement  as two ways to find the grade of a student.
// Percent>=85 && Percent<=100 Grade ‘A’
// Percent>=70 Grade ‘B’
// Percent>=50 Grade ‘C’
// otherwise print ”Fail”

public class Question_7 {
    public static void main(String[] args) {
        int Percent = (int) (Math.random() * 100);
        
        char grade_1 = grade_using_if(Percent); 
        char grade_2 = grade_using_switch(Percent);
        
        if(grade_1 == ' ')
            System.out.println("Grade: Fail");
        else
            System.out.println(
                "Percentage :" + Percent + 
                "\nGrade using if clause : " + grade_1 + 
                "\nGrade using switch clause : " + grade_2
            );
    }    

    
    public static char grade_using_if(int Percent) {
        char Grade = ' ';
        if (Percent >= 85 && Percent <= 100) Grade = 'A';
        else if (Percent >= 70)              Grade = 'B';
        else if (Percent >= 50)              Grade = 'C';
        return Grade;
    }

    public static char grade_using_switch(int Percent) {
        char Grade = ' ';
        switch (Percent / 10) {
            case 10: 
            case 9:
            case 8:
                Grade = 'A';
                break;
            case 7:
                Grade = 'B';
                break;
            case 6:
            case 5:
                Grade = 'C';
                break;
            default:
                System.out.println("Grade: Fail");
        }
        return Grade;
    }
}
