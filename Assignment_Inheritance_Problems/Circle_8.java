package Assignment_Inheritance_Problems;
public class Circle_8 extends Shape_8{
    @Override
    public double getArea(int r,double pi) {
        return pi*Math.pow(r,2);
    }

    @Override
    public double getPerimeter(int r,double pi) {
        return 2*pi*r;
    }

    public static void main(String[] args) {
        Circle_8 obj=new Circle_8();
        System.out.println(obj.getArea(3,3.14));
        System.out.println(obj.getPerimeter(3,3.14));
    }
}
