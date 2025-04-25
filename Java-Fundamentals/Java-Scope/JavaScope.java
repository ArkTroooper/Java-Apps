public class JavaScope 
{
    public static void main(String[] args) 
    {
        // Code here cannot access variable x
        int x = getNumber(); // Variable x of type int
        // Code here can access variable x
        System.out.println("Value of x: " + x);
    }
    public static int getNumber() 
    {//Block starts here
        return 42; // Example value
    }//Block ends here 
}