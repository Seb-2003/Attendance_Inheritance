package vehicles.boats;
import vehicles.Boat;

//Sets a Fandango class that extends to the Boat class to extend the methods and objects from that class. It also includes what the Boat class has extended to (Vehicle)
public class Fandango extends Boat{
// Method to call to from the main class. This will get the variables based on the attributes on the super class which is the boat class.
    public Fandango(int speed, String color, String price, String MainSail_Color) {
    	// Calls the super class (Boat) with the attributes above to be passed on to that class.
    	super(speed, color, price, MainSail_Color);
    }

// Override method to call to from the main class. This will print out that a specific boat is floating.
    @Override
    public void afloat() {
        System.out.println("The Fandango is Floating");
    }
    
// Method to call to from the main class. This will print out the values based on what is provided on the attributes.
    public void printDetails() {
        System.out.println("Boat: Fandango");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Sail Color: " + MainSail_Color);
        System.out.println();
    };
}
