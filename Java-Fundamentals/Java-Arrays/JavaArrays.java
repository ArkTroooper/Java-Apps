import java.text.MessageFormat;
import java.util.Random;

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
        //Multidimensional Arrays

        int[][] myNumbers = {{1,343,5,3563,547,3,4562},{245,62455,73,242,7,2,5,},{3252,234,26,67,4,90,0},{35462,267,8,0,7,4}}; //an Array of arrays
        
        for (int i = 0; i < myNumbers.length; ++i)  // .length still works. Length of Array of arrays 
        {
            for (int j = 0; j < myNumbers[i].length; ++j) //.length of array at element[i] - 
            {
              System.out.println(myNumbers[i][j]);
            }
        }
        
        for(int[] row : myNumbers)
        {
            for (int i : row) 
            {
                System.out.println(i);   
            }
        }
    }
}