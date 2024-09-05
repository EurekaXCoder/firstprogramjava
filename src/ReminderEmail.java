public class ReminderEmail 

{
    public static void main(String[] args) 
    {
        String[] reminder = {"Ethan", "Eddie", "Lily", "Mariam", "Jasmine", "Nathan", "Jolene", "Carla", "Rapunzel", "Olaf"};
        //this initilizes and the string name and stores the array of library names.

        for (String reminders : reminder)
        {
            //This iterates through each customer in the array using a for each loop

            System.out.println("Sending reminder email to " + reminders + ": Please return your overdue books to the library as soon as possible.");
            //prints a message sending an email to the current overdue members name
        }
        
    }
    
}
