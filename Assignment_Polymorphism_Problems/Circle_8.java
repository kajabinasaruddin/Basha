package Assignment_Polymorphism_Problems;
public class Circle_8 extends Shape_8{
    private double radius;
    public Circle_8(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;  // Area = πr²
    }
}
