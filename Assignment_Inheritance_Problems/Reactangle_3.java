package Assignment_Inheritance_Problems;
public class Reactangle_3 extends Shape_3 {
    @Override
    public void getArea(int l,int b){
        System.out.println(l*b);
    }
    public static void main(String[] args) {
        Reactangle_3 obj=new Reactangle_3();
        obj.getArea(10,20);
    }
}
