package Abstraction_Examples;
public class Project5 extends Project3{
    @Override
    void makeSound() {
        System.out.println("mom");
    }
    public static void main(String[] args) {
        Project5 obj=new Project5();
        obj.eat();
        obj.makeSound();
    }
}

