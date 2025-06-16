//Create base class Vehicle:
//Fields: plateNumber, baseRate
//Method: calculateRental(int days)
//Subclasses:
//Car: charges baseRate * days
//Truck: charges baseRate * days + load fee
//Bike: fixed rate regardless of days
//Override calculateRental() to reflect different pricing models.
//File: VehicleRental.java.

class Vehicle{
    public String plateNumber;
    protected int baseRate;

    public Vehicle(String plateNumber, int baseRate){
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    public double calculateRental(int days){
        return baseRate * days;
    }
}

class Car extends Vehicle{
    public Car(String plateNumber, int baseRate){
        super(plateNumber, baseRate);
    }

    @Override
    public double calculateRental(int days){
        return baseRate * days;
    }
}

class Truck extends Vehicle{
    double loadfee;
    public Truck(String plateNumber, int baseRate, double loadfee){
        super(plateNumber, baseRate);
        this.loadfee = loadfee;
    }

    @Override
    public double calculateRental(int days){
        return baseRate * days + loadfee;
    }
}

class Bike extends Vehicle{
    private double fixedRate;
    public Bike(String plateNumber, double fixedRate){
        super(plateNumber, 0);
        this.fixedRate = fixedRate;
    }

    @Override
    public double calculateRental(int days){
        return fixedRate;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle car = new Car("BA7845", 8000 );
        Vehicle truck = new Truck("GA 12 kha9895", 2000, 6000);
        Vehicle bike =new Bike("BA 59 pa 1234",1000);

        System.out.println("Car Rental for 3 days: "+car.calculateRental(3));
        System.out.println("Truck Rental for 4 days: "+truck.calculateRental(4));
        System.out.println("Bike Rental for 5 days: "+bike.calculateRental(5));
    }
}