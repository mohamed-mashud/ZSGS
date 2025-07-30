//  7. Develop a Java program to illustrate the usage of toString() method.

public class Question_7 {
    public static void main(String[] args) {
        Operands operands = new Operands();
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        operands.setA(a);
        operands.setB(b);

        System.out.println(
            operands.toString()
        );
    }
}

class Operands {
    private int a;
    private int b;

    public Operands() {
    }

    public int getA() {
        return a;
    }
 
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Operands [a=" + a + ", b=" + b + "]";
    }

}
