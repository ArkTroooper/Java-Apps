import java.text.MessageFormat;

public class JavaMath 
{
    public static void main(String[] args) 
    {   
        int max = Math.max(78, 87);
        System.out.println(MessageFormat.format("Max: {0}", max));
        int min = Math.min(78, 87);
        System.out.println(MessageFormat.format("Min: {0}", min));
        double sqrt = Math.sqrt(78);
        System.out.println(MessageFormat.format("Sqrt: {0}", sqrt));
        double abs = Math.abs(-578.364);
        System.out.println(MessageFormat.format("Abs: {0}", abs));
        int randomNum = (int)(Math.random()*101); //random generates a number between 0(inclusive) and 1(exclusive)
        System.out.println(MessageFormat.format("Random Number: {0}", randomNum));

    }     
}