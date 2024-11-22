public class Test {
    public static void main(String[] args) {

        Vehicle ride1 = new Car(1.5);
        Vehicle ride2 = new Aeroplane(1000);   // use polymorphism feature

        ride1.displayVehicleDetails();
        ride2.displayVehicleDetails();  // call polymorphic methods
    }
}
