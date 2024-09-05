public class PrizeDraw 
{
    //This program will randomly select a name from the participants names for the Random Prize Draw
    public static void main(String[] args) 
    {
        //This is where the array statement is made and given a name and stores all the participant's names
        String [] PrizeDraw =
        {
        "Ethan",
        "Eddie",
        "Lily",
        "Mariam",
        "Jasmine",
        "Nathan",
        "Jolene",
        "Carla",
        "Rapunzel",
        "Olaf"
        };

        //This code generates a random index to randomly select a participant's name 
        int prizeDrawIndex =(int) (Math.random() * PrizeDraw.length);

        //This code outputs to the user the randomly selected winner's name
        System.out.println("The randomly selected winner's name is " + PrizeDraw[prizeDrawIndex]);
    }
    
}
