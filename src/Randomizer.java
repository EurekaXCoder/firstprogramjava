public class Randomizer 
{
    public static void main(String[] args) 
    {
        String [] countries =
        {
            "England",
            "Germany",
            "India",
            "Argentina",
            "Australia"
        };

        int countryIndex = (int)(Math.random() * countries.length);

        System.out.println("The next travel destination from today will be " + countries[countryIndex]);
    }
    
}
