package Assignment_Polymorphism_Problems;
public class Cylinder_12 extends Shape_12 {
    private double radius;
    private double height;
    public Cylinder_12(double radius, double height) {
        this.radius = radius;
        this.height = height;}
    @Override
    public void draw() {
        System.out.println("Drawing a Cylinder with radius " + radius + " and height " + height); }
    @Override
    public double calculateArea() {
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Total Surface Area of Cylinder: " + surfaceArea);
        return surfaceArea;}
    public static void main(String[] args) {
        Circle_12 shape1 = new Circle_12(5);
        Shape_12 shape2 = new Cylinder_12(5, 10);
        shape1.draw();
        shape1.calculateArea();
        System.out.println();
        shape2.draw();
        shape2.calculateArea();}}