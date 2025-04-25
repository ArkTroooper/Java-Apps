public class Main 
{
    public void fullThrotle() 
    {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) 
    {
        System.out.println("Max speed is: " + maxSpeed);
    }
    public static void main(String[] args) 
    {
        Main myObj = new Main(); // Create an object of Main
        myObj.fullThrotle(); // Call the fullThrotle method
        myObj.speed(200); // Call the method with an argument
    }
}