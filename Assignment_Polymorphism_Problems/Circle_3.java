package Assignment_Polymorphism_Problems;
public class Circle_3 extends Shape_3 {
    private double radius;
    public Circle_3(double radius) {
        this.radius = radius;
    }
    @Override
    public void calculateArea() {
        double pi = 3.14;
        System.out.println("Area of Circle: " + pi * Math.pow(radius, 2));
    }
}
