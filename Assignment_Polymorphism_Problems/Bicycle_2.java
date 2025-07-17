package Assignment_Polymorphism_Problems;
public class Bicycle_2 extends Vechile_2{
    @Override
    public int speedUp() {
        speed+=3;
        return speed;
    }
    public static void main(String[] args) {
        System.out.println("Car:");
        Car_2 obj=new Car_2();
        System.out.println(obj.speedUp());
        System.out.println("Bicycle:");
        Bicycle_2 obj1=new Bicycle_2();
        System.out.println(obj1.speedUp());
    }
}
