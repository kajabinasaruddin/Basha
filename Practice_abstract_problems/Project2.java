package Practice_abstract_problems;
public class Project2 extends Project1{
    @Override
    void makeSound() {
        System.out.println("Make Sound");
    }
    public static void main(String[] args) {
        Project2 obj=new Project2();
        obj.makeSound();
    }
}
