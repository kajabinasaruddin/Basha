package Assignment_Inheritance_Problems;
public class Car_9 extends Vehicle_9 {
    public Car_9(){
        details();
    }
    public double fuel_efficiency(){
        return 10.0;
    }
    public double ditsance_traveled(){
        return 4.5;
    }
    public int max_Speed(){
        return 60;
    }
    void display(){
        dis();
        System.out.println("fuel_efficiency : "+fuel_efficiency());
        System.out.println("ditsance_traveled : "+ditsance_traveled());
        System.out.println("max_Speed : "+max_Speed());
    }
}
