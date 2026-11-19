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
    void brake() {
        System.out.println("This Truck get Stopped By using Hand Brake");
    }

    void accelerate() {
        System.out.println("This Truck Is (Tata)get Accelrated By Accelerator");
    }
}

class AshokLayland extends Truck {
    void brake() {
        System.out.println("This Truck get Stopped By using Leg Brake");
    }

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

        AshokLayland asl = new AshokLayland();
        asl.brake();
        asl.drive();
        asl.accelerate();

        Tata tt = new Tata();
        tt.brake();
        tt.drive();
        tt.accelerate();
    }

}