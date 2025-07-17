package Assignment_Polymorphism_Problems;
public class Rectangle_3 extends Shape_3 {
    private double length;
    private double width;
    public Rectangle_3(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangle: " + length * width);
    }
}
