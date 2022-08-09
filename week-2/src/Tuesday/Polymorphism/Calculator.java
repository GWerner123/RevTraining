package Tuesday.Polymorphism;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    //static keyword means we associate this method with the class rather than the object
    public static int multiply(int a, int b) {
        return a * b;
    }
}
