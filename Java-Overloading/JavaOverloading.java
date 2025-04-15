public class JavaOverloading {

    // Method 1: Returns an integer
    public int calculate(int a, int b) {
        return a + b;
    }

    // Method 2: Returns a double
    public double calculate(double a, double b) {
        return a * b;
    }

    // Method 3: Returns a string
    public String calculate(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        JavaOverloading obj = new JavaOverloading();

        // Testing the overloaded methods
        System.out.println("Integer addition: " + obj.calculate(5, 10));
        System.out.println("Double multiplication: " + obj.calculate(2.5, 4.0));
        System.out.println("String concatenation: " + obj.calculate("Hello, ", "World!"));
    }
}