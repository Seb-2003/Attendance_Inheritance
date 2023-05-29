package vehicles.cars;
import vehicles.Car;

// Sets a ToyotaVios class that extends to the Car class to extend the methods and objects from that class. It also includes what the Car class has extended to (Vehicle)
public class ToyotaVios extends Car{
// Method to call to from the main class. This will get the variables based on the attributes on the super class which is the car class.
    public ToyotaVios(int speed, String color, String price, String tire) {
    	// Calls the super class (car) with the attributes above to be passed on to that class.
    	super(speed, color, price, tire);
    }

// Override method to call to from the main class. This will print out that a specific car is driving.
    @Override
    public void drive() {
        System.out.println("The Toyota-VIOS is Driving");
    }
    
// Method to call to from the main class. This will print out the values based on what is provided on the attributes.
    public void printDetails() {
        System.out.println("Car: Toyota-VIOS");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Tire: " + tire);
        System.out.println();
    };
}
