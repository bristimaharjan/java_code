// Interface representing a generic vehicle
interface Vehicle {
    public void turnOn();
}

// Interface representing a four-wheeler's basic functionality
interface Fourwheeler {
    public void applyBrakes();
}

// Class Car implementing both Vehicle and Fourwheeler interfaces
class Car implements Vehicle, Fourwheeler {

    @Override
    public void turnOn() {
        System.out.println("The car's engine is turned on.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("The car is slowing down.");
    }
}

// Main class to demonstrate the implementation of interfaces
public class Maindemo {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.turnOn();      // Method from Vehicle interface
        obj.applyBrakes(); // Method from Fourwheeler interface
    }
}
