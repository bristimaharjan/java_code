// Base class representing a generic vehicle
class Vehicle1 {
    public void igniteEngine() {
        System.out.println("The vehicle's engine is ignited.");
    }

    public void shutEngine() {
        System.out.println("The vehicle's engine is turned off.");
    }
}

// Derived class representing a car, which is a specific type of vehicle
class Car1 extends Vehicle1 {
    public void applyBrakes() {
        System.out.println("The car's brakes are applied.");
    }

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
}

// Another derived class representing a Tesla, which is a specific type of car
class Tesla extends Car1 {
    public void enableAutopilot() {
        System.out.println("Tesla's autopilot mode is enabled.");
    }

    
}

// Main class to demonstrate multilevel inheritance
public class Multilevel {
    public static void main(String[] args) {
        // Creating an object of Tesla class
        Tesla obj = new Tesla();

        // Calling methods from Tesla class and its superclasses
        obj.igniteEngine();      // Method from Vehicle1 class
        obj.accelerate();        // Method from Car1 class
        obj.enableAutopilot();   // Method from Tesla class
        obj.applyBrakes();       // Method from Car1 class
        obj.shutEngine();        // Method from Vehicle1 class
    }
}

