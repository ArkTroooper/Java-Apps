public class JavaReturnValues 
{
    public static void main(String[] args) 
    {
        int returnedInt = add(5, 10);
        System.out.println("Returned int: " + returnedInt);
        int returnedInt2 = subtract(10, 5); 
        System.out.println("Returned int: " + returnedInt2);
        int returnedInt3 = multiply(5, 10);
        System.out.println("Returned int: " + returnedInt3);
        int returnedInt4 = divide(10, 5);
        System.out.println("Returned int: " + returnedInt4);
        int returnedInt5 = modulus(10, 3);
        System.out.println("Returned int: " + returnedInt5);
        int returnedInt6 = power(2, 3);
        System.out.println("Returned int: " + returnedInt6);
        int returnedInt7 = square(5);
        System.out.println("Returned int: " + returnedInt7);
        int returnedInt8 = cube(3);
        System.out.println("Returned int: " + returnedInt8);
        int returnedInt9 = squareRoot(16);
        System.out.println("Returned int: " + returnedInt9);
        int returnedInt10 = cubeRoot(27);
        System.out.println("Returned int: " + returnedInt10);
        int returnedInt11 = absolute(-5);
        System.out.println("Returned int: " + returnedInt11);
        int returnedInt12 = factorial(5);
        System.out.println("Returned int: " + returnedInt12);
        int returnedInt13 = fibonacci(5);
        System.out.println("Returned int: " + returnedInt13);
        int returnedInt14 = gcd(10, 5);
        System.out.println("Returned int: " + returnedInt14);
        int returnedInt15 = lcm(10, 5);
        System.out.println("Returned int: " + returnedInt15);
        int returnedInt16 = prime(7);
        System.out.println("Returned int: " + returnedInt16);
        int returnedInt17 = palindrome(121);
        System.out.println("Returned int: " + returnedInt17);
        int returnedInt18 = armstrong(153);
        System.out.println("Returned int: " + returnedInt18);

        
    }
    static int add(int a, int b)
    {
        return a + b;
    }
    static int subtract(int a, int b)
    {
        return a - b;
    }
    static int multiply(int a, int b)
    {
        return a * b;
    }
    static int divide(int a, int b)
    {
        if (b == 0) 
        {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
    static int modulus(int a, int b)
    {
        return a % b;
    }
    static int power(int a, int b)
    {
        return (int) Math.pow(a, b);
    }
    static int square(int a)
    {
        return a * a;
    }
    static int cube(int a)
    {
        return a * a * a;
    }
    static int squareRoot(int a)
    {
        return (int) Math.sqrt(a);
    }
    static int cubeRoot(int a)
    {
        return (int) Math.cbrt(a);
    }
    static int absolute(int a)
    {
        return Math.abs(a);
    }
    static int factorial(int a)
    {
        if (a < 0) 
        {
            System.out.println("Cannot calculate factorial of negative number");
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= a; i++) 
        {
            result *= i;
        }
        return result;
    }
    static int fibonacci(int n)
    {
        if (n < 0) 
        {
            System.out.println("Cannot calculate fibonacci of negative number");
            return 0;
        }
        if (n == 0) 
        {
            return 0;
        }
        if (n == 1) 
        {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static int gcd(int a, int b)
    {
        if (b == 0) 
        {
            return a;
        }
        return gcd(b, a % b);
    }
    static int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
    static int prime(int n)
    {
        if (n <= 1) 
        {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) 
            {
                return 0;
            }
        }
        return 1;
    }
    static int palindrome(int n)
    {
        int reversed = 0;
        int original = n;
        while (n != 0) 
        {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        if (original == reversed) 
        {
            return 1;
        }
        return 0;
    }
    static int armstrong(int n)
    {
        int sum = 0;
        int original = n;
        int digits = String.valueOf(n).length();
        while (n != 0) 
        {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        if (original == sum) 
        {
            return 1;
        }
        return 0;
    }
}