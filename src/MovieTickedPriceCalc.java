import java.util.Scanner;
public class MovieTickedPriceCalc 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //This is the welcome message to the user explaining what the program is used for and gives the options to enter in.
        System.out.println("Welcome to the Interactive Movie Ticket Price Calculator! Please enter the number for the day you would like to know the prices for!");
        System.out.println("1 for Monday");
        System.out.println("2 for Tuesday");
        System.out.println("3 for Wednesday");
        System.out.println("4 for Thursday");
        System.out.println("5 for Friday");
        System.out.println("6 for Saturday");
        System.out.println("7 for Sunday");
        //This is where the number entered is taken from the user
        int day = scanner.nextInt();
        //This is where the switch statement starts and each ticket price for each day is stored with each number from 1- 7
        switch (day)
        {
            case 1:
              System.out.println("Ticket price is $10");
              break;
            case 2:
              System.out.println("Ticket price is $8");
              break;
            case 3:
              System.out.println("Ticket price is $10");
              break;
            case 4:
              System.out.println("Ticket price is $8");
              break;
            case 5:
              System.out.println("Ticket price is $12");  
              break;
            case 6:
              System.out.println("Ticket price is $15");
              break;
            case 7:
              System.out.println("Ticket price is $15");
              break;
            //This is where the program outputs a message when the user types an invalid number or letter
            default:
              System.out.println("Sorry the number you've entered is invalid, Please try again with the given numbers!");
        }
        scanner.close();
    }
}
