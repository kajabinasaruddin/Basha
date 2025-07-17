package Assignment_Polymorphism_Problems;
public class Cat_1 extends Animal_1{
    @Override
    public void sound() {
        System.out.println("cat sound");
    }
    public static void main(String[] args) {
        System.out.println("birds :");
        Bird_1 obj=new Bird_1();
        obj.sound();
        System.out.println("Cat :");
        Cat_1 obj1=new Cat_1();
        obj1.sound();
    }
}
