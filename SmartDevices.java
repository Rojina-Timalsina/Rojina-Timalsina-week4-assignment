//Create a base class SmartDevice with fields: brand, model, and methods turnOn() and turnOff().
//Create subclasses: SmartPhone and SmartWatch.
//Override turnOn() and turnOff() in both subclasses to show device-specific behavior.
//Instantiate devices and call their methods to demonstrate runtime polymorphism.
//File: SmartDevices.java.


class SmartDevice {
    private String brand;
    private String model;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getDeviceInfo() {
        return brand + " " + model;
    }

    public void turnOn() {
        System.out.println(getDeviceInfo() + " is turning on.");
    }

    public void turnOff() {
        System.out.println(getDeviceInfo() + " is turning off.");
    }
}

// Subclass
class SmartPhone extends SmartDevice {
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println(getDeviceInfo() + "  is booting up.");
    }

    @Override
    public void turnOff() {
        System.out.println(getDeviceInfo() + "  is shutting down.");
    }
}

// Subclass: SmartWatch
class SmartWatch extends SmartDevice {
    public SmartWatch(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println(getDeviceInfo() + " is showing time.");
    }

    @Override
    public void turnOff() {
        System.out.println(getDeviceInfo() + "  is showing sleep mode.");
    }
}


public class SmartDevices {
    public static void main(String[] args) {
        
        SmartDevice[] devices = {
            new SmartPhone("Samsung", "Galaxy S21"),
            new SmartWatch("Apple", "iphone 11")
        };

        for (SmartDevice device : devices) {
            device.turnOn();
            device.turnOff();
            System.out.println(); 
        }
    }
}