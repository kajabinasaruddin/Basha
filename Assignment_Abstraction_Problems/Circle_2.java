package Assignment_Abstraction_Problems;
public class Circle_2 extends Shape_2{
    private int radius;
   public Circle_2(int radius){
       this.radius=radius;}
    @Override
    public void calculateArea()
    {
        double pi=3.14;
        System.out.println(pi*Math.pow(radius,2));}
    @Override
    public void calculatePerimeter() {
        double pi=3.14;
        System.out.println(2*pi*radius);}
    public static void main(String[] args) {
        Circle_2 obj=new Circle_2(3);
        Circle_2 obj1=new Circle_2(3);
        obj.calculateArea();
        obj.calculatePerimeter();
    }
}