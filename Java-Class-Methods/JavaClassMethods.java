public class JavaClassMethods 
{
    static void myMethod() //Method definition/declaration
    {
        System.out.println("Hello World");//Method action
    }
    //Static method 
    static void myStaticMethod() 
    {
        System.out.println("Static methods can be called without creating objects");
    }
    //Public method
    public void myPublicMethod() 
    {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) 
    {
        myMethod(); //Call the method
        myStaticMethod(); //Call the static method
        
        JavaClassMethods obj = new JavaClassMethods(); 
        obj.myPublicMethod(); //Call the public method

    }
}