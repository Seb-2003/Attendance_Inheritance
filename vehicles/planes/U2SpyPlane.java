package vehicles.planes;
import vehicles.Plane;

//Sets a U2SpyPlane class that extends to the Plane class to extend the methods and objects from that class. It also includes what the Plane class has extended to (Vehicle)
public class U2SpyPlane extends Plane {
// Method to call to from the main class. This will get the variables based on the attributes on the super class which is the plane class.
    public U2SpyPlane(int speed, String color, String price, double wingspan) {
    	// Calls the super class (Plane) with the attributes above to be passed on to that class.
    	super(speed, color, price, wingspan);
    }

// Override method to call to from the main class. This will print out that a specific plane is flying.
    @Override
    public void fly() {
        System.out.println("The U-2 Spy Plane is Flying");
    }
    
// Method to call to from the main class. This will print out the values based on what is provided on the attributes.
    public void printDetails() {
        System.out.println("Plane: U2SpyPlane");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Wingspan: " + wingspan + " Meters");
        System.out.println();
    };
}
