public class WorkOutGenerator 
{
    //This program will select a random different workout for each day to make it more exciting
    public static void main(String[] args) 
    {
        //This is where the array is initialized and names and stores all the types of workouts
        String [] WorkOutGenerator =
        {
      
        "Push-ups",
        "Squats",
        "Running",
        "Yoga",
        "Cyclying",
        "Jump rope"
        };

        //This code generates a random index to randomly select a different workout for the day
        int workOutIndex = (int) (Math.random() * WorkOutGenerator.length);

        //This code outputs and prints "Hello!, your workout for today will be" and then the workout for the day
        System.out.println("Hello!, your workout for today will be " + WorkOutGenerator[workOutIndex]);
        
    }
    
}
