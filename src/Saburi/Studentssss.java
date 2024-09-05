package Saburi;

// Public class named Studentssss, accessible from other classes in the package or outside
public class Studentssss 
{   // Method to display the student's acceptancegrade
    public void AcceptanceLetter()
    {   //local variable to store the student's grade
        int studentLetter = 95;
        //This code prints the students grade with the students name
        System.out.println("Madur's grade for Java is " + studentLetter);
    }

    public static void main(String[] args)
    {   //This creates an object of the Studentssss class named results
        Studentssss results = new Studentssss();
        //this calls the AcceptanceLetter method on the results object
        results.AcceptanceLetter();
    }
}
