public class TypeCasting 
{
    public static void main(String[] args) {
        // Java type casting - assigning the value of one primitive data type to another type
        // widening casting - convert a smaller type to a larger type size  (automatically)
        // byte > short > char > int > long > float > double 
        // narrowing casting - convert a larger type to a smaller size type(manually)
        // double > float > long > int > char > short > byte 
        
        //widening
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        //narrowing
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myInt2);
        System.out.println(myDouble2);
        
        int maxScore = 500;
        int userScore = 423;

        float percentage = (float) userScore/maxScore *100.0f;

        System.out.println("User's percentage is " + percentage);
    }
}