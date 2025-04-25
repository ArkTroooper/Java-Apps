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
        //nested loops
        for(int i = 0;i <=10;i++)
        {
            System.out.println("Outer count: "+i);
            for(int j = 0;j <=5;j++)
            {
                System.out.println(" inner count: "+j);
            }
        }
        //for each loop
        String[] cars = {"BMW","Volvo","Mazda"};
        for (String car : cars) 
        {
            System.out.println(car);
        }
    }
}