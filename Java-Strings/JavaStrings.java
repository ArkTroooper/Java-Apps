import java.text.MessageFormat;

public class JavaStrings
{
    public static void main(String[] args) 
    {
        String greeting = "Hello";

        String txt = "wevwkeqov;erwdlcs qp  2[[; ;Q[    [N]]]]13156vwwww rg werg  veadfav65dvadf51vadf "; //mashed 
        System.out.println(MessageFormat.format("The length of a string is: {0}", txt.length()));

        System.out.println(MessageFormat.format("Greeting in uppercase: {0}", greeting.toUpperCase()));
        System.out.println(MessageFormat.format("Greeting in lowercase: {0}", greeting.toLowerCase()));

        String locate = "Please locate where 'locate' occurs!";
        System.out.println(MessageFormat.format("The index of the first letter of locate is: {0}", locate.indexOf("locate")));

        //Concatenation 

        String name = "name";
        String surname = "surname";

        System.out.println(MessageFormat.format("{0} {1}",name,surname));
        System.out.println(name + " " + surname);
        System.out.println(name.concat(surname));

        // Java uses the + operator for both addition and concatenation 
        
        //special characters

        String quotationMarks = "We are the so-called \"Vikings\" from the north.";
        String apostrophe = "It\'s alright";
        


    }
}