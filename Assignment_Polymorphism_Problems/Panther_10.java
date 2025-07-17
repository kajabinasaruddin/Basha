package Assignment_Polymorphism_Problems;
public class Panther_10 extends Animal_10{
    @Override
    public void eat() {
        System.out.println("The panther eats meat.");
    }
    @Override
    public void sound() {
        System.out.println("The panther purrs.");
    }
    public static void main(String[] args) {
        Lion_10 lion = new Lion_10();
        Tiger_10 tiger = new Tiger_10();
        Panther_10 panther = new Panther_10();
        System.out.println("Lion:");
        lion.eat();
        lion.sound();
        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();
        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}
