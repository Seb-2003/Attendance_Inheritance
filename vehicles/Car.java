package vehicles;

// Sets a Car class that extends to the vehicle class to extend the methods and objects from that class
public class Car extends Vehicle {
    public String tire;

// Method to call to from various car classes. This will set the variables of the attributes
    public Car(int speed, String color, String price, String tire) {
    	// Calls the super class (vehicle) with the attributes above to be passed on to that class.
    	super(speed, color, price);
    	// Sets the variable tire from the attributes above.
        this.tire = tire;
    }

// Method to call to from various car classes. This has got overridden by the drive methods from various car classes.
    public void drive() {
        System.out.println("The car is driving.");
    }
}
