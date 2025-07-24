// 4. Write a program to illustrate that Classes cannot be used 
// for multiple Inheritance.


// this line will throw out an error due to multiple inheritance
public class Question_4 extends A, B{
    public static void main(String[] args) {
        return;
    } 
}

class A {
    int data;
    public A(int data) {
        this.data = data;
    }
}

class B {
    int data;
    public B(int data) {
        this.data = data;
    }
}
