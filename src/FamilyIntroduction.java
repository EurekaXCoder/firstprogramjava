public class FamilyIntroduction 
{
    static void fullNames(String firstName, int age, String location)
    {
       // Defines a static void method named fullName that takes a string (firstName) and an integer (age) and string (location) as parameters.
       
       System.out.println(firstName + " Johnson is " + age + " years old and currently stays at " + location);
       //prints the full name with Johnson as the last name and their age and where they currently stay
    }

    public static void main(String[] args)
    {
        fullName("Ethan", 25, "British Columbia");
        fullName("Lily", 28, "Montreal");
        fullName("Eddie", 23, "New York");
        fullName("Jasmine", 22, "Toronto");
    }
}
