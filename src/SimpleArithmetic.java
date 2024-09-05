import java.util.Scanner;
public class SimpleArithmetic 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        //Ask the user to enter the first number
        System.out.print("Enter the first number: ");
        int firstVariable = scanner.nextInt(); // this code takes the first input from the user

        //Ask the user to enter the second number
        System.out.print("Enter the second number: ");
        int secondVariable = scanner.nextInt(); //this code takes the second input from the user

        //this multiplies the two numbers and stores it into the results variable
        int results = firstVariable * secondVariable;

        // Print and output the results
        System.out.println("The result of multiplying the " + firstVariable + " and " + secondVariable + " is " + results);

        scanner.close();
    }
}
