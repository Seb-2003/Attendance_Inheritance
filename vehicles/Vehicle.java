package vehicles;

// Sets a class vehicle
public class Vehicle {
    public int speed;
    public String color;
    public String price;

// Method to call to from other vehicle classes. This will set the variables of the attributes
    public Vehicle(int speed, String color, String price) {
        this.speed = speed;
        this.color = color;
        this.price = price;
    }

// Method to call to from other classes. This will print from the console that will inform the vehicle has stopped.
    public void stop() {
        System.out.println("The vehicle has stopped.");
    }
}