// Interface - what a vehicle can do
interface Vehicle {
    void start();
    void stop();
}

// Car implements Vehicle
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key");
    }
    
    @Override
    public void stop() {
        System.out.println("Car stops with brakes");
    }
}

// Bike implements Vehicle
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a kick");
    }
    
    @Override
    public void stop() {
        System.out.println("Bike stops with hand brakes");
    }
}

// Main class
public class example {
    public static void main(String[] args) {
        // Create objects
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        
        // Use them
        myCar.start();
        myCar.stop();
        
        System.out.println();
        
       myBike.start();
       myBike.stop();
    }
}
