import java.text.MessageFormat;

public class BooleanTypes
{
    public static void main(String[] args)
    {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(MessageFormat.format("Is Java Fun: {0}",isJavaFun));
        System.out.println(MessageFormat.format("Is Fish Tasty: {0}",isFishTasty));

        int x = 54;
        int y = 6546;
        System.out.println(x>y);
        System.out.println(x<y);

        System.out.println(x == 54);
        System.out.println(58 == 54);

    }
}