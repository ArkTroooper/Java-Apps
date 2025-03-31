import java.util.Random;

public class ForLoop 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int x = rand.nextInt(50);
        for(int i = 0; i < x;i++)
        {
            System.out.println(i);
        }
    }
}