package Assignment_Inheritance_Problems;
public class Truck_9 extends Vehicle_9 {
    public Truck_9(){
        details();
    }
    public double fuel_efficiency(){
        return 15.0;
    }
     public double ditsance_traveled(){
        return 6.0;
     }
     public int max_Speed(){
        return 100;
     }
     void display(){
        dis();
         System.out.println("fuel_efficiency: "+fuel_efficiency());
         System.out.println("ditsance_traveled: "+ditsance_traveled());
         System.out.println("max_Speed :"+max_Speed());
     }
}
