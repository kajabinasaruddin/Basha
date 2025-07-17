package Assignment_Inheritance_Problems;
public class Chetah_6 extends Animal_6{
    @Override
    public String move() {
        return "run";
    }
    public static void main(String[] args) {
       Chetah_6 obj=new Chetah_6();
        System.out.println(obj.move());
    }
}
