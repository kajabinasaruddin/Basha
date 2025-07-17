package Assignment_Polymorphism_Problems;
public class Motorcycle_11 extends Vechile_11{
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle engine by kicking or pressing the start button...");
    }
    @Override
    public void stopEngine() {
        System.out.println("Turning off the motorcycle engine...");
    }
    public static void main(String[] args) {
        Car_11 myCar = new Car_11();
        Motorcycle_11 myMotorcycle = new Motorcycle_11();
        System.out.println("Car:");
        myCar.startEngine();
        myCar.stopEngine();

        System.out.println("\nMotorcycle:");
        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}
