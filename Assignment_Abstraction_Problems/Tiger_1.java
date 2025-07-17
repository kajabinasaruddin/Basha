package Assignment_Abstraction_Problems;

public class Tiger_1 extends Animal_1{
    @Override
    public void sound() {
        System.out.println("tiger sound");
    }
    public static void main(String[] args) {
        Tiger_1 obj=new Tiger_1();
        obj.sound();
        Lion_1 obj1=new Lion_1();
        obj1.sound();
    }
}
