public class CountDownTimer 
{
    public static void main(String[] args) 
    {
        //entry point of the java Application
        int countdown = 10;
        //This initializes a variable to start the count down from the number 10

        while (countdown > 0);
        {
            //this loops as long the countdown value is greater than 0

            System.out.println(countdown);
            //prints the curernt countdown value

            countdown--;
            //Decreases the countdown value by 1

            try
            {
                Thread.sleep(1000);
                //this pauses the program for 1000 millieseconds 1 second between each countdown.
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                //handles any interruptions
            }
        }
        System.out.println("Happy Birthday!!");
        //prints "Happy Birthday!!" after the countdown reaches 0    
    }
}
