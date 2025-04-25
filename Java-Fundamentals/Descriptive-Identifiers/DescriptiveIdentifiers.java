import java.text.MessageFormat;

public class DescriptiveIdentifiers
{
    public static void main(String[] args)
    {
    //Employee Data 
    String employeeName = "John Doe";
    int employeeID = 123456;
    int employeeAge = 29;
    float employeeFee = 25356.3645f;
    char employeeSeniority = 'A'; // A-Z with A being the highest

    System.out.println("Employee Name: " + employeeName);
    System.out.println("Employee ID: " + employeeID);
    System.out.println("Employee Age: " + employeeAge);
    System.out.println("Employee Fee: " + employeeFee);
    System.out.println("Employee Seniority: " + employeeSeniority);

    //Good ol' area of a rectangle 
    int length = 8;
    int breadth = 5;
    int area = length * breadth;
    System.out.println(MessageFormat.format("Length is: {0}\nBreadth is: {1}\nArea of the rectangle is{2}", length,breadth,area));

    

    }
}