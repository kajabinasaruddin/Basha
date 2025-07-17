package Assignment_Abstraction_Problems;
public class Triangle_13 extends GeometricShape_13{
    private double breadth;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    public Triangle_13(double breadth, double height)
    {
        this.breadth=breadth;
        this.height=height;}
    @Override
    public double area() {
        return 0.5 * breadth * height;}
    public Triangle_13(double side1, double side2, double side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;}
    @Override
    public double perimeter() {
        return side1+side2+side3;}
    public static void main(String[] args) {
        Triangle_13 obj = new Triangle_13(10,20);
        System.out.println(obj.area());
        Triangle_13 obj1 = new Triangle_13(2,3,4);
        System.out.println(obj1.perimeter()); } }
