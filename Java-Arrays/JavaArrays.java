import java.text.MessageFormat;
import java.util.Random;
import java.lang.Object;

public class JavaArrays 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        int[] myNums = {1,23,435,4,66,423,24423,52,16,7};

        System.out.println(cars[r.nextInt(cars.length)]); //argument is exclusive for the random funtion
        System.out.println(myNums[r.nextInt(myNums.length)]);

        cars[r.nextInt(cars.length)] = "Mercedes Benz";
        myNums[r.nextInt(myNums.length)] = 200;

        System.out.println("Displaying the content of the arrays");

        for (int n : myNums) 
        {
            System.out.println(MessageFormat.format("Number in myNums :{0}",n));
        }

        for (String c : cars) 
        {
            System.out.println(MessageFormat.format("Car in cars :{0}",c));
        }

        for (int i = 0; i < myNums.length; i++) 
        {   
            System.out.println(MessageFormat.format("Number {0} in myNums :{1}",i,myNums[i]));
        }

        for (int i = 0; i < cars.length; i++) 
        {
            System.out.println(MessageFormat.format("Car {0} in cars :{1}",i,cars[i]));
        }

    }
}