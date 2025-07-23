// 5. Define a method to find the sum of even numbers from the series
// 1, 2, 3, 4, 5, ...n using continue statement.

public class Question_5 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        int sum = 0;

        for(int i = 0; i <= number; i++) {
            if(i % 2 == 1)   continue;
            sum += i;
        }
        System.out.println(sum);
    }
}
