package Assignment_Polymorphism_Problems;
public class Triangle_6 extends Shape_6{
    private double side1, side2, side3;
    public Triangle_6(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double getArea() {
        // Using Heron's Formula
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3; }// Perimeter = sum of all sides
    public static void main(String[] args) {
        Circle_6 circle = new Circle_6(5);
        Rectangle_6 rectangle = new Rectangle_6(4, 6);
        Triangle_6 triangle = new Triangle_6(3, 4, 5);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
    }
}
