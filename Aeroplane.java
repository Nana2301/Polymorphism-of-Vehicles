public class Aeroplane extends Vehicle {
    private int billPassenger;

    public Aeroplane(int passenger)       // Aeroplane constructor
    {
        super(1990, 500000.0);
        billPassenger = passenger;
    }

    public void displayVehicleDetails()   // display Aeroplane details
    {
        System.out.println("Aeroplane details :\n");
        System.out.println("Year Manufactured :" + manufacturedYear);
        System.out.println("Price : " + price);
        System.out.println("Bill passenger :" + billPassenger);
    }
}