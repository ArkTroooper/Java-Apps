public class JavaConstructor 
{
    int x; // Create a class attribute
    // Create a class constructor for the Main class
    public JavaConstructor() 
    {
        x = 5; // Set the initial value for x
    }
    // Create a class constructor with parameters
    public JavaConstructor(int y) 
    {
        x = y; // Set the initial value for x
    }
    public static void main(String[] args) 
    {
        JavaConstructor myObj1 = new JavaConstructor(); // Create an object of class Main (this will call the constructor)
        JavaConstructor myObj2 = new JavaConstructor(10); // Create an object of class Main (this will call the constructor with a parameter)
        System.out.println(myObj1.x); // Print the value of x
        System.out.println(myObj2.x); // Print the value of x
    }
    
}