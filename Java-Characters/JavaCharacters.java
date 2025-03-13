import java.text.MessageFormat;

public class JavaCharacters
{
    public static void main(String[] args)
    {
        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 65, myVar3 = 67; //ASCII Values
        System.out.println(MessageFormat.format("MyVar1:{0}\nMyVar2:{1}\nMyVar3:{2}", myVar1,myVar2,myVar3));

        String greeting = "Hello World";
        System.out.println(greeting);

    }
}