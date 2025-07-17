package Assignment_Inheritance_Problems;
public class Motorcycle_9 extends Vehicle_9 {
    public Motorcycle_9(){
        details();
    }
    public double fuel_efficiency(){
        return 9.0;
    }
    public double ditsance_traveled(){
        return 3.0;
    }
    public int max_Speed(){
        return 40;
    }
    void display(){
        dis();
        System.out.println("fuel_efficiency :" +fuel_efficiency());
        System.out.println("ditsance_traveled" +ditsance_traveled());
        System.out.println("max_Speed" +max_Speed());
    }
}
