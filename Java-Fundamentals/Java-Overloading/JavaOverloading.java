public class JavaOverloading {

    // Method 1: Returns an integer
    static int Calculate(int a, int b) {
        return a + b;
    }

    // Method 2: Returns a double
    static double Calculate(double a, double b) {
        return a * b;
    }

    // Method 3: Returns a string
    static String Calculate(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        //JavaOverloading obj = new JavaOverloading(); - another way to overload methods, the access modifier of the method should be public

        // Testing the overloaded methods
        System.out.println("Integer addition: " + Calculate(5, 10)); //obj.Calculate(5, 10));
        System.out.println("Double multiplication: " + Calculate(2.5, 4.0)); //obj.Calculate(2.5, 4.0));
        System.out.println("String concatenation: " + Calculate("Hello, ", "World!")); //obj.Calculate("Hello, ", "World!"));
    }
}