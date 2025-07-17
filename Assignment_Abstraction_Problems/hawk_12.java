package Assignment_Abstraction_Problems;
public class hawk_12 extends Bird_12{
    @Override
    public void fly() {
        System.out.println("hawk fly");
    }
    @Override
    public void makeSound() {
        System.out.println("hawk makesound");
    }
    public static void main(String[] args) {
        Eagle_12 obj=new Eagle_12();
        obj.fly();
        obj.makeSound();
        hawk_12 obj1 = new hawk_12();
        obj.fly();
        obj1.makeSound();
    }
}
