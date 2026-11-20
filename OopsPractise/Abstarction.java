package OopsPractise;

//Low Level Abstraction
class Car {
    void drive() {
        System.out.println("Car Get Start By using key");
    }

    void accelerate() {
        System.out.println("Car is accelerated Using Accelerator");
    }

    void brake() {
        System.out.println("When Brake is apllied Car get stopped");
    }
}

// High level abstraction using abstract class
abstract class Truck {
    void drive() {
        System.out.println("Truck get start By using Key");
    }

    abstract void brake();

    abstract void accelerate();
}

class Tata extends Truck {
    @Override
    void brake() {
        System.out.println("Tata Truck get Stopped By using Hand Brake");
    }

    @Override
    void accelerate() {
        System.out.println("This Truck Is (Tata)get Accelrated By Accelerator");
    }
}

class AshokLayland extends Truck {
    @Override
    void brake() {
        System.out.println("AshokLayland Truck get Stopped By using Leg Brake");
    }

    @Override
    void accelerate() {
        System.out.println("This Truck (AshokLayland)Is get Accelrated By Accelerator");
    }
}

public class Abstarction {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        c.accelerate();
        c.brake();

        // AshokLayland asl = new AshokLayland();
        // //We can use the Method Of parent class
        // asl.brake();
        // asl.drive();
        // asl.accelerate();

        // Tata tt = new Tata();
        // // Here Also We can use the Method Of parent class
        // tt.brake();
        // tt.drive();
        // tt.accelerate();

        // This Same Thing Can also be done by Another Way
        Truck tr = new AshokLayland();
        tr.drive();
        tr.accelerate();
        tr.brake();

        // Another Class

        Truck truck = new Tata();
        truck.drive();
        truck.accelerate();
        truck.brake();
    }

}