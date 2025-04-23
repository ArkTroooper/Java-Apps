public class JavaClassAttributes 
{
    int x = 5; // Instance variable 
    int y = 10; // Other instance variable    

    final int z = 15; // Constant
    public static void main(String[] args) 
    {
        JavaClassAttributes obj = new JavaClassAttributes(); // Create an object of JavaClassAttributes
        System.out.println("Value of x: " + obj.x); // Access my instance variable
        System.out.println("Value of y: " + obj.y); // Access my other instance variable

        obj.x = 20; // Modify my instance variable
        obj.y = 30; // Modify my other instance variable
        System.out.println("Modified value of x: " + obj.x); // Access my modified instance variable   
        System.out.println("Modified value of y: " + obj.y); // Access my other modified instance variable
        //obj.z = 25 will generate an error: cannot assign a value to final variable z
        System.out.println("Value of z: " + obj.z); // Access my constant
    }
    
}