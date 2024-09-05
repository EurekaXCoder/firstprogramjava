import java.time.LocalDate;
import java.util.Scanner;
public class MyCurrentDate 
{
    public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(System.in);
        //This code outputs a messege for the user to type in their name to proceed
        System.out.println("Hi to check today's date please type in your Name!");
        //this takes the users name and stores it in the string Name 
        String Name = scanner.nextLine();
        //This creates a ddate object that stores the current date
        LocalDate Today = LocalDate.now();
        //This prints out the persons name withe today's date
        System.out.println("Hello " + Name + ", today's date is " + (Today));
    }
}