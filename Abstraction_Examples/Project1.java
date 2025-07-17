package Abstraction_Examples;
public class Project1 implements Project {
    @Override
    public void display(){
        System.out.println("Display");
    }
    @Override
    public void notDisplay() {
        System.out.println("not Display");
    }
    public void noSound(){
        System.out.println("no sounds");
    }
}