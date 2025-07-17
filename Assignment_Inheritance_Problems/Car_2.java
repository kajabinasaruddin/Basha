package Assignment_Inheritance_Problems;
public class Car_2 extends Vechile_2 {
    @Override
    public void drive(){
        System.out.println("Repairing a car");
    }
    public static void main(String[] args) {
        // child to child
        Car_2 obj=new Car_2();
        obj.drive();
        // parent to child
        Vechile_2 obj1=new Car_2();
        obj1.drive();
        // parent to parent
        Vechile_2 obj2=new Vechile_2();
        obj2.drive();
    }
}
