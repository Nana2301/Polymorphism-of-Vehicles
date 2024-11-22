public abstract class Vehicle             // Vehicle is abstract class
    {
        protected int manufacturedYear;
        protected double price;

        public Vehicle(int year, double price)   // Vehicle constructor
                {
                    manufacturedYear = year;
                    this.price = price;
                    }

                    public abstract void displayVehicleDetails();  // abstract method
        }