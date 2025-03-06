import java.text.MessageFormat;

public class PrintVariables 
{
    public static void main(String[] args)
    {
        String name = "Andrew";
        System.out.println("my name is " + name);

        //quickly becomming a fan of this form
        System.out.println(MessageFormat.format("People usually call me {0}",name));

        String firstName = "John ";
        String lastName = "Doe";

        //concatenation
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x+y);
    }
}