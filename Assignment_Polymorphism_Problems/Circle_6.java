package Assignment_Polymorphism_Problems;
public class Circle_6 extends Shape_6{
    private double radius;
    public Circle_6(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        double pi=3.14;
        return pi*Math.pow(radius,2); // Area = πr²
    }
    @Override
    public double getPerimeter() {
        double pi=3.14;
        return 2 * pi * Math.pow(radius,2); // Perimeter = 2πr
    }
}
