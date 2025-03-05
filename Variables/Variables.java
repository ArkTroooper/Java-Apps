import java.text.MessageFormat;

public class Variables
{
    public static void main(String[] args)
    {
        // type variableName = value
        // ^ how to declare variables
        // ^ use 'final' before type to declare a variable as constant 

        /*String - stores text, such as "Hello". String values are surrounded by double quotes
          int - stores integers (whole numbers), without decimals, such as 123 or -123
          float - stores floating point numbers, with decimals, such as 19.99 or -19.99
          char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
          boolean - stores values with two states: true or false 
        */
        
        int i = 1;
        String s = "a string";
        float f = 5.6f;
        char c = 'D';
        boolean b = true;

        System.out.println(MessageFormat.format("Int: {0} \nString: {1} \nFloat: {2} \nChar: {3} \nBoolean: {4}", i,s,f,c,b));
    }
}