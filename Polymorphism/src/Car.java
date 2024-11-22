public class Car extends Vehicle {
    private double cc;

    public Car(double cc) {
        super(2006, 100000.0); // Pass year and price to Vehicle constructor
        this.cc = cc;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Car details:\n");
        System.out.println("Year Manufactured: " + manufacturedYear);
        System.out.println("Price: " + price);
        System.out.println("CC: " + cc);
    }
}
