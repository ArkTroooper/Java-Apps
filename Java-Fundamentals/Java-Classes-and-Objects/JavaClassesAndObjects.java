public class JavaClassesAndObjects 
{
        // This is a class variable
        int x = 5;
        public static void main(String[] args) 
        {
            // Create an object of the class
            JavaClassesAndObjects obj = new JavaClassesAndObjects();
            JavaClassesAndObjects obj2 = new JavaClassesAndObjects();
            // Call the method to print the value of x
            System.out.println("Value of x in obj: " + obj.x);
            System.out.println("Value of x in obj2: " + obj2.x);
        }
}