import java.text.MessageFormat;
import java.util.Random;

public class IfStatement 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();

        //if
        int x = rand.nextInt(1000);
        int y = rand.nextInt(1000);
        if(x>y)
        {
            System.out.println(MessageFormat.format("x:{0} is greater than y:{1}",x,y));
        } 
        
        //if else
        if(x>y)
        {
            System.out.println(MessageFormat.format("x:{0} is greater than y:{1}",x,y));
        }
        else
        {
            System.out.println(MessageFormat.format("y:{0} is greater than x:{1}",y,x));
        }

        //if else if 
        int time = rand.nextInt(24)+1;
        if (time <10)
        {
            System.out.println("Good Morning.");
        }
        else if(time < 18)
        {
            System.out.println("Good day.");
        }
        else    
        {
            System.out.println("Good evening.");
        }

        //shorthand if else
        String result = (time < 18) ? "Good day." : "Good Evening.";
        System.out.println(result);
        
    }
}