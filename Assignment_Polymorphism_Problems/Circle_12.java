package Assignment_Polymorphism_Problems;
public class Circle_12 extends Shape_12{
    private double radius;
    public Circle_12(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
        return area;
    }
}
