public class JavaRecursion 
{
    public static void main(String[] args) 
    {
        // Test the recursive function
        int n = sum(50);
        System.out.println(n);

    }
    public static int sum(int n) 
    {    
        if (n > 0) 
        {
            return n + sum(n - 1); // Recursive call
        } 
        else 
        {
            return 0; // Base case
            
        }
    }
}