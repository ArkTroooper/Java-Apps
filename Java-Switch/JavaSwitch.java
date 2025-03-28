import java.util.Random;

public class JavaSwitch 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();

        int myNum = rand.nextInt(7)+1;

        switch (myNum) {
            case 1:
                System.out.println("1");   
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break; 
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            default:
                System.out.println("this should never be displayed");
                break;
        }

    }
}