//Class Device: field deviceName, method operate()
//Subclasses:
//Light: operate() turns on light
//Thermostat: operate() sets temperature
//SecurityCamera: operate() starts recording
//Demonstrate polymorphism using a Device[] list.
//File: SmartHomeSystem.java.

class Device {
    private String deviceName;  

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String operate() {
        return deviceName + " is operating.";
    }
}

class Light extends Device {
    public Light(String deviceName) {
        super(deviceName);
    }

    @Override
    public String operate() {
        return getDeviceName() + " is turned on.";
    }
}

class Thermostat extends Device {
    public Thermostat(String deviceName) {
        super(deviceName);
    }

    @Override
    public String operate() {
        return getDeviceName() + " is setting the temperature.";
    }
}

class SecurityCamera extends Device {
    public SecurityCamera(String deviceName) {
        super(deviceName);
    }

    @Override
    public String operate() {
        return getDeviceName() + " is recording video.";
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        
        Device[] devices = {
            new Light("Living Room Light"),
            new Thermostat("Home Thermostat"),
            new SecurityCamera("Front Door Camera")
        };

        
        for (Device device : devices) {
            System.out.println(device.operate());
        }
    }
}
