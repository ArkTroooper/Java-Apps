import java.util.Random;
import java.text.MessageFormat;

public class BreakAndCodContinue
{
    public static void main(String[] args) 
    {
        //conditional breaks
        Random r = new Random();
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(MessageFormat.format("Loop count:{0}",i));
            if (i == r.nextInt(11)) 
            {
                System.out.println("Loop will now break.");
                break;
            }    
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(MessageFormat.format("Second Loop count:{0}",i)); 
            if(i == r.nextInt(11))
            {
                System.out.println("Loop will now break.");
                break;
            }
            else
            {
                continue;
            }
        }
    }
}