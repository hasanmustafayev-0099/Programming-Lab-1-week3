package javaapplication32;

public class main {

    public static void main(String[] args) {
        
        Car car = new Car("06CPL750","Vito",0.0,0.0,50.0);
        car.checkStatus();
        car.Refuel(65);
        car.Drive(30);
        
        car.checkStatus();
        
        
        
         car.Refuel(65);
          car.Drive(45);
             car.checkStatus();
    }
    
}