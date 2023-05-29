package vehicles;

// Sets a Plane class that extends to the vehicle class to extend the methods and objects from that class
public class Plane extends Vehicle {
    public double wingspan;

// Method to call to from various plane classes. This will set the variables of the attributes
    public Plane(int speed, String color, String price, double wingspan) {
    	// Calls the super class (plane) with the attributes above to be passed on to that class.
    	super(speed, color, price);
    	// Sets the variable wingspan from the attributes above.
        this.wingspan = wingspan;
    }

// Method to call to from various plane classes. This has got overridden by the drive methods from various car classes.
    public void fly() {
        System.out.println("The plane is flying.");
    }
}