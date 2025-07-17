package Assignment_Polymorphism_Problems;
public class Triangle_3 extends Shape_3 {
    private double base;
    private double height;
    public Triangle_3(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of Triangle: " + 0.5 * base * height);
    }
    public static void main(String[] args) {
        Circle_3 obj=new Circle_3(5);
        obj.calculateArea();
        Rectangle_3 obj1=new Rectangle_3(4,6);
        obj1.calculateArea();
        Triangle_3 obj2=new Triangle_3(3,7);
        obj2.calculateArea();
    }
}
