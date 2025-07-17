package Assignment_Polymorphism_Problems;
public class Triangle_8 extends Shape_8{
    private double base;
    private double height;
    public Triangle_8(double base, double height) {
        this.base = base;
        this.height = height;}
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");}
    @Override
    public double calculateArea() {
        return 0.5 * base * height;  }// Area = 1/2 * base * height
    public static void main(String[] args) {
        Circle_8 circle=new Circle_8(5);
        Square_8 square = new Square_8(4);
        Triangle_8 triangle = new Triangle_8(6, 3);
        System.out.println("Circle:");
        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("\nSquare:");
        square.draw();
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("\nTriangle:");
        triangle.draw();
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
