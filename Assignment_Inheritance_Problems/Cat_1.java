package Assignment_Inheritance_Problems;
public class Cat_1 extends Animal_1{
    @Override
    public void makeSound() {
        System.out.println("bark");
    }

    public static void main(String[] args) {
        //child to child
        Cat_1 obj=new Cat_1();
        obj.makeSound();
        //parent to child
        Animal_1 obj1=new Cat_1();
        obj1.makeSound();
    }
}