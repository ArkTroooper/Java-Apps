import java.text.MessageFormat;

public class DeclareMultipleVariables 
{
    public static void main(String[] args)
    {
        //Declare multiple variable of a specific type on one line

        int x, y, z;
        x = 1;
        y = 2;
        z = 3;

        System.out.println(MessageFormat.format("x:{0}\ny:{1}\nz:{2}",x,y,z));

        String a,b,c,d;
        a = "This ";
        b = "is ";
        c = "a ";
        d = "sentence.";

        System.out.println(MessageFormat.format("{0}{1}{2}{3}",a,b,c,d));

        float e, f, g;
        e = 45.255f;
        f = 98.3666666666f;
        g = 6954.25f;

        System.out.println(MessageFormat.format("e:{0}\nf:{1}\ng:{2}",e,f,g));

        char h,i,j;
        h = 'h';
        i = 'i';
        j = 'j';

        System.out.println(MessageFormat.format("h:{0}\ni:{1}\nj:{2}", h,i,j));

        boolean k,l;
        k = true;
        l = false;

        System.out.println(MessageFormat.format("k:{0}\nl:{1}",k,l));

        //declaration and assignment
        String m = "Here's ", n = "another ", o = "sentence";
        int p = 1, q = 2, r = 3;
        float s = 25.355f, t = 6821.2215f, u = 558.3366455554555f;
        boolean v = true, w = false;
        char aa = 'a', ab = 'a', ac = 'c'; 

    }
}