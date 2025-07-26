// 2. Can we override private method, constructor, static method, final method? Illustrate with an example.

/*
 * No we cant override private methods as they are only accessible within the class
 * We can't override constructor as it is not a method
 * Also we cant override static methods as they depend on the class itself
 * We can't override final methods as they are declared to be final and can't be overridden
 */

 /**
  * Question_2.java:12: error: privateMethod() has private access in Child
        child.privateMethod(); 
             ^
    Question_2.java:38: error: method does not override or implement a method from a supertype
        @Override
        ^
    Question_2.java:47: error: static methods cannot be annotated with @Override
        @Override
        ^
    Question_2.java:53: error: finalMethod() in Child cannot override finalMethod() in ParentClass
        final void finalMethod() {
                ^
    overridden method is final
    4 errors
*/

public class Questions_2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.privateMethod(); 
        child.staticMethod(); 
        child.finalMethod(); 
    }
}


class ParentClass {
    private void privateMethod() {
        System.out.println("This is a private method from Parentclass");
    }

    public ParentClass() {
        System.out.println("This is a constructor from Parentclass 1");
    }
    
    static void staticMethod() {
        System.out.println("Static method from Parent Class");
    }
    
    final void finalMethod() {
        System.out.println("This is a final method from Parent Class");
    }
}

class Child extends ParentClass {
    @Override
    private void privateMethod() {
        System.out.println("this is a private method from child class");
    }

    @Override
    public ParentClass() {
        System.out.println("This is a constructor from Parentclass 1");
    }

    @Override
    static void staticMethod() {
        System.out.println("Static method from Child Class");
    }

    @Override
    final void finalMethod() {
        System.out.println("This is a final method from Child Class");
    }
}