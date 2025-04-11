import java.text.MessageFormat;

public class JavaMethods 
{
    static void myMethod()
    {
        System.out.println("Output of My Method");
    }
    static void myMethod2()
    {
        System.out.println("I just got executed!");
    }

    //Parameters and arguments
    static void iLike(String subject)
    {
        System.out.println(MessageFormat.format("I like {0}", subject));
    }
    static void nameAndAge(String name,int age)
    {
        System.out.println(MessageFormat.format("First name: {0} Age: {1}", name,age));
    }
    static void canConsumeAlcohol(int age)
    {
        if (age >= 18) 
        {
            System.out.println("You can consume alcohol");
        }
        else
        {
            System.out.println("You can't consume alcohol");
        }
    }
    public static void main(String[] args) 
    {   
        myMethod();
        myMethod2();
        iLike("Burgers");
        iLike("Pizza");
        iLike("Pasta");
        nameAndAge("Aaron", 26);

        canConsumeAlcohol(15);
        canConsumeAlcohol(24);

        
    }   
}