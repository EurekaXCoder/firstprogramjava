//Base class representing a car
class vehiclePoly
{
    // Method to simulate the sound made by the car, named CarSound
    public void CarSound()
    {
        System.out.println("The car makes a sound when the engines on");
    }

}
// Subclass represents Tesla car, inherits from vehiclePoly
class Tesla extends vehiclePoly
{
    public void CarSound()
    {
        // Override the CarSound method to specify the sound a Tesla makes when the engines is on and running
        System.out.println("The Tesla goes Phroom");
    }
}
// Subclass represents an Audi, inherits from vehiclePoly
class Audi extends vehiclePoly
{
    // Override the CarSound method to specify the sound an Audi makes when the engines is on and running
    public void CarSound()
    {
        System.out.println("The Audi goes brrrrom");
    }
}
// Main class to test the behavior of the different car classes
class vehiclePolyMain
{
    public static void main(String[] args)
    {   //I Create an object of the base class vehiclePoly named myVehiclepoly
        vehiclePoly myVehiclepoly = new vehiclePoly();
        //I Create an object of the Tesla car class named myTeslapoly, treated as a vehiclePoly
        vehiclePoly myTeslapoly = new Tesla();
        //I Create an object of the Audi car class named myAudipoly, treated as a vehiclePoly
        vehiclePoly myAudipoly = new Audi();
        //Call the CarSound method on each object
        myVehiclepoly.CarSound();
        myTeslapoly.CarSound();
        myAudipoly.CarSound();
    }
}

    
