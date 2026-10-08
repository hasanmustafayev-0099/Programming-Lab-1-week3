package javaapplication32;

public class Car {
    
    protected String plateNumber;
    protected String model;
    protected double mileage;
    protected double fuelLevel;
    protected double tankCapacity;
    
    
    public    Car( String plateNumber, String model,double mileage,double fuelLevel,double tankCapacity) {
        
this.plateNumber=plateNumber;
  this.model=model;
  
  this.mileage=mileage ;
  this.tankCapacity=tankCapacity ;
this.fuelLevel= fuelLevel;
}
    
    public   void Drive(double km) {
        
    if(fuelLevel<(km/10)){
        
        System.out.println(" Not enough Fuel level ");
    }else{
        System.out.println("Driving....");
    fuelLevel = fuelLevel - km/10;
    mileage +=km;
    
    }
        
        System.out.println("");
    }
    public void Refuel(double lt){
        System.out.println("Refueling....");
    if((fuelLevel+lt)>tankCapacity){
        
        fuelLevel +=lt;
        System.out.println("Tank is full, Extra fuel. " +(fuelLevel-tankCapacity)+"lt disscarded" );
        
    fuelLevel = tankCapacity;
    }else{
    fuelLevel+=lt;
    }
    }
    
    public   void checkStatus(){
        System.out.println("-------------------------");
        System.out.println("model : " + model);
        System.out.println("plate : " + plateNumber);
        System.out.println(" mileage : " + mileage);
        System.out.println(" fuel level : " + fuelLevel);
    if(fuelLevel<(tankCapacity/10)){
        
        
        System.out.println(" Low fuel warning!!!");
        
    }
    
    System.out.println("-------------------------");
    }
    
}