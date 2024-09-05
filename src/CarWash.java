import java.util.Scanner;
public class CarWash

{
    public static void main(String[] args) 
    //this is the entry point for the Java application
    {
        Scanner scanner = new Scanner(System.in);
        //This creates a a Scanner object to read the input from the user
        
        System.out.println("Hello welcome to the Car Wash please select from the 4 options given below and type the number next to the option you would like to choose");
        

        int selected;
        //this is the variable which is ccreated to get the input from the user as the selected option 

        do 
        {
            System.out.println("1. Basic Wash");
            System.out.println("2. Deluxe Wash");
            System.out.println("3. Wax Service");
            System.out.println("4. Done");
            //all the avaliable options for the Car Wash

            selected = scanner.nextInt();
            //Stores the users selected option to chose from

            switch(selected)
            {
            //switch statement which will show the right numbers option on screen selected based on the users input
            case 1 : System.out.println("Basic Wash is Selected");
            break;
            //stops if Basic Wash is Selected

            case 2 : System.out.println("Deluxe Wash is Selected");
            break;
            //stops if Deluxe Wash is Selected

            case 3 : System.out.println("Wax Service is Selected");
            break;
            //stops if Wax Service is Selected

            case 4 : System.out.println("Thank you for choosing our service");
            break;
            //stops if Done is selected

            default : System.out.println("Invalid selection. Please try again!");
            // This is the error message that pops when an invalid letters are entered.
            }
        }
        while (selected !=4);
        //This while statement continues looping until the user selects "Done"

        scanner.close();
        //closes the Scanner to free resources
    }
}
