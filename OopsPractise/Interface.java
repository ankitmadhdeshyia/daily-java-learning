   package OopsPractise;
   interface Car{
    void start();
    void drive();
    void accelerate();
   }
   class Electric implements Car{
   public void start(){
        System.out.println("Electric Start By key");
    }
   public void drive(){
        System.out.println("Electric Driven by The Driver");
    }
   public void accelerate(){
        System.out.println("Electric accelerated By The Leg");
    }
   }
   class FuelCar implements Car{
   public void start(){
        System.out.println("FuelCar Start By key");
    }
   public void drive(){
        System.out.println("FuelCar Driven by The Driver");
    }
   public void accelerate(){
        System.out.println("FuelCar accelerated By The Leg");
    }
   }
   class Dezire extends Electric{
   public void start(){
        System.out.println("Dezire Start By key");
    }
   public void drive(){
        System.out.println("Dezire Driven by The Driver");
    }
   public void accelerate(){
        System.out.println("Dezire accelerated By The Leg");
    }
   }
   class Dezire2001 extends Electric{
   public void start(){
        System.out.println("Dezire2001 Start By key");
    }
   public void drive(){
        System.out.println("Dezire2001 Driven by The Drivery");
    }
   public void accelerate(){
        System.out.println("Dezire2001 accelerated By The Leg");
    }
   }
   
   public class Interface {
   public static void main(String[] args) {
      Electric el=new Electric();
      el.drive();
      el.accelerate();
      el.start();

      FuelCar fc=new FuelCar();
      fc.drive();
      fc.start();
      fc.accelerate();

      Electric e1=new Dezire();
      e1.start();
      e1.drive();
      e1.accelerate();

      Electric e2=new Dezire2001();
      e2.start();
      e2.drive();
      e2.accelerate();

      
      
   }
    
   } 