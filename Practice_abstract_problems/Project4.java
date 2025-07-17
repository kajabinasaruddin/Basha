package Practice_abstract_problems;
public class Project4 implements Project3 {
    @Override
    public void makeSound() {
        System.out.println("makeSound");
    }
    @Override
    public void stop() {
        System.out.println("stop");
    }
    public static void main(String[] args) {
        Project4 obj = new Project4();
        obj.makeSound();
        obj.stop();

    }
}