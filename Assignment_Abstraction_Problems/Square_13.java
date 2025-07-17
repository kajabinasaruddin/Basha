package Assignment_Abstraction_Problems;
public class Square_13 extends GeometricShape_13{
    private double side;
    public Square_13(double side){
        this.side=side;
    }
    @Override
    public double area() {
        return side*side;
    }
    @Override
    public double perimeter() {
        return 4*side;
    }
    public static void main(String[] args) {
        Square_13 obj=new Square_13(2);
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
    }
}
