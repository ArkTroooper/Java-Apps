import java.text.MessageFormat;

public class JavaNumbers
{
    public static void main(String[] args)
    {
        byte myByte = 100;              // -128 to 127
        System.out.println(MessageFormat.format("Byte: {0}",myByte));     

        short myShort = 5000;           // -32768 to 32767  
        System.out.println(MessageFormat.format("Short: {0}",myShort));

        int myInt = 10000;              // -2147483648 to 2147483647
        System.out.println(MessageFormat.format("Int: {0}",myInt));

        Long myLong = 150000000000000L; // -9223372036854775808 to 9223372036854775807
        System.out.println(MessageFormat.format("Long: {0}",myLong));

        float myFloat = 87.3f;          // 6-7 decimal points
        System.out.println(MessageFormat.format("Float: {0}",myFloat));

        double myDouble = 19.999d;      // 16 decimal points
        System.out.println(MessageFormat.format("Double: {0}",myDouble));

        
        float f1 = 35e3f;               // Scientific numbers               
        double d1 = 12E4d;
        System.out.println(MessageFormat.format("float * 10 to the power of 3: {0}", f1));
        System.out.println(MessageFormat.format("double * 10 to the power of 4: {0}", d1));

    
    }

}