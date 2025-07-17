package Assignment_Polymorphism_Problems;
public class Rectangle_6 extends Shape_6{
    private double length;
    private double width;
    public Rectangle_6(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width; // Area = length × width
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width); // Perimeter = 2(length + width)
    }
}
