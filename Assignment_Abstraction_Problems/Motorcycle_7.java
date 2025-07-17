package Assignment_Abstraction_Problems;

public class Motorcycle_7 extends Vechile_7 {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine strted");
    }
    @Override
    public void stopEngine() {
        System.out.println("motorcycle engine stopped");
    }
    public static void main(String[] args) {
        Car_7 obj=new Car_7();
        obj.startEngine();
        obj.stopEngine();
        Motorcycle_7 obj1=new Motorcycle_7();
        obj1.startEngine();
        obj1.stopEngine();
    }
}
