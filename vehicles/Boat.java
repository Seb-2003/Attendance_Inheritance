package vehicles;

// Sets a Boat class that extends to the vehicle class to extend the methods and objects from that class
public class Boat extends Vehicle {
    public String MainSail_Color;

// Method to call to from various boat classes. This will set the variables of the attributes
    public Boat(int speed, String color, String price, String MainSail_Color) {
    	// Calls the super class with the attributes above to be passed on to that class.
    	super(speed, color, price);
    	// Sets the variable MainSail_Color from the attributes above.
        this.MainSail_Color = MainSail_Color;
    }

 // Method to call to from various boat classes. This has got overridden by the drive methods from various car classes.
    public void afloat() {
        System.out.println("The boat is floating.");
    }
}
