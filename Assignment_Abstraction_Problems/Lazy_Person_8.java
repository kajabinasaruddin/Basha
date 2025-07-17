package Assignment_Abstraction_Problems;
public class Lazy_Person_8 extends Person_8 {
    @Override
    public void eat() {
        System.out.println("Lazy person eats fast food");
    }
    @Override
    public void excersise() {
        System.out.println("lazy person practice excersises rarely");
    }
    public static void main(String[] args) {
        Athelet_8 obj=new Athelet_8();
        System.out.println("Athelet routinTime :");
        obj.eat();
        obj.excersise();
        Lazy_Person_8 obj1=new Lazy_Person_8();
        System.out.println("lazyPerson rountime :");
        obj1.eat();
        obj1.excersise();
    }
}
