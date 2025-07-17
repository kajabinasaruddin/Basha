package Assignment_Encpsulation_Problems;
import java.util.Scanner;
public class Circle_5 {
    private double radius;
    public Circle_5(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;}
    public void setRadius(double radius) {
        this.radius = radius;}
    public void calculateArea(){
        double pi=3.14;
        System.out.println(pi*Math.pow(radius,2));
    }
    public void calculatePerimeter(){
        double pi=3.14;
        System.out.println(2*pi*radius);}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius :");
        double radius=sc.nextDouble();
        Circle_5 obj=new Circle_5(radius);
        obj.calculateArea();
        obj.calculatePerimeter();
    }
}
