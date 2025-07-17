package Assignment_Polymorphism_Problems;
public class Panthera_7 extends Animal_7{
    @Override
    public void move() {
        System.out.println("The panthera moves stealthily on the ground.");
    }
    @Override
    public void makeSound() {
        System.out.println("The panthera roars.");
    }
    public static void main(String[] args) {
        Animal_7 myBird = new Bird_7();
        Animal_7 myPanthera = new Panthera_7();
        System.out.println("Bird:");
        myBird.move();
        myBird.makeSound();
        System.out.println("Panthera:");
        myPanthera.move();
        myPanthera.makeSound();
    }
}
