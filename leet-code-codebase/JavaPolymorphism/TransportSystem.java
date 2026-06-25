class Vehicle {
    void fuelCost(int km) {
         System.out.println("fuel cost" );
    }
}

class Car extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Car Cost: " + (km * 8));
    }
}

class Bus extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Bus Cost: " + (km * 15));
    }
}

class Bike extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Bike Cost: " + (km * 3));
    }
}

class ElectricCar extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Electric Car Cost: " + (km * 2));
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        for (Vehicle v : fleet) {
            if (v instanceof Car)
                ((Car) v).fuelCost(10);
            else if (v instanceof Bus)
                ((Bus) v).fuelCost(10);
            else if (v instanceof Bike)
                ((Bike) v).fuelCost(10);
            else if (v instanceof ElectricCar)
                ((ElectricCar) v).fuelCost(10);
        }
    }
}
