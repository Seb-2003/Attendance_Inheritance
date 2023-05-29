import vehicles.planes.U2SpyPlane;
import vehicles.cars.ToyotaVios;
import vehicles.boats.Fandango;

public class Main {
    public static void main(String[] args) {
    	
// PLANES
// Speed (km/h), Color, Price, Wingspan (meters)
     // Calls the u2SpyPlane method with the following attributes
        U2SpyPlane u2SpyPlane = new U2SpyPlane(900, "Black", "$120,000,000", 31);
     // Calls the u2SpyPlane printDetails method to print from the console with the following attributes above
        u2SpyPlane.printDetails();
     // Calls the u2SpyPlane fly method to print from the console
        u2SpyPlane.fly();
     // Calls the stop method from the Vehicle class
        u2SpyPlane.stop();
        System.out.println("\n========================\n");
        
// CARS
// Speed (km/h), Color, Price, Tire Type
        ToyotaVios toyotaVios = new ToyotaVios(170, "Black", "$14800", "175/65 R14"); 
        toyotaVios.printDetails();
        toyotaVios.drive();
        toyotaVios.stop();
        System.out.println("\n========================\n");

// BOATS
// Speed (km/h), Color, Price, Sail Color
        Fandango Fandango = new Fandango(9, "Turquoise", "$19,750.00", "Blue");
        Fandango.printDetails();
        Fandango.afloat();
        Fandango.stop();
        System.out.println("\n========================\n");
    }
}