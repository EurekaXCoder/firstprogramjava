// this is a base class representing a animal
class MyInheritanceAnimal 
{   //Attribute representing the type of animal, accessible to subclasses due to protected acess modifier
    protected String mammal = "Lion"; 
    //this is a methos to simulate the osunds of the animal
    public void voiceSound()
    {   
        System.out.println("Roarr!");
    }
}

//Thisis the subclass representing a specific breed of animal, a mammal, which inherits from MyInheriteanceAnimal
class Animal extends MyInheritanceAnimal 
{   //Attribute represeting the type of mammal . private to the Animal class
    private String mammalBreed = "WhiteLion";

    public static void main(String[] args)
    {   //This is where i create an object of the Animal names my Animal
        Animal myAnimal = new Animal();
        //This calls the voiceSound methos inherited from the MyheritanceANimal on the myAnimal object
        myAnimal.voiceSound();
        //This outputs and displays the type of mammal and the specific breed of the animal and its name
        System.out.println(myAnimal.mammal + " is a mammal that have a rare species such as the " + myAnimal.mammalBreed);
    }
}