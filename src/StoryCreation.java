import java.util.Scanner;
public class StoryCreation 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //this is the code that tells what the program will do and make
        System.out.println("Welcome to the short story creation app please enter the required information to create a short story!");
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); //this is the code that takes the name

        System.out.println("Enter the place: ");
        String place = scanner.nextLine(); //this is the code that takes the place

        System.out.println("Enter the activity: ");
        String activity = scanner.nextLine(); //this is the code that takes the activity

        //this is the code that outputs the short story with the take information from the user
        System.out.println("Once upon a time, " + name + " went to the " + place + " and spent the whole day " + activity + ". It was a fantastic adventure!");

        //close the scanner
        scanner.close();
    }


 } 