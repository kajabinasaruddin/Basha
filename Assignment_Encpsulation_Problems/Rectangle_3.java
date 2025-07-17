package Assignment_Encpsulation_Problems;
import java.util.Scanner;
public class Rectangle_3 {
    private double length;
    private double width;
    public Rectangle_3(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if(length>0) {
        this.length = length;
        }
        else {
            System.out.println("length must be take positive values");
        }
    }
    public double getWidth() {   return width; }
    public void setWidth(double width) {
        if(width>0) {   this.width = width;
        }
        else{
            System.out.println("with must me take positve values");
        }
    }
    public double calculateArea(){  return length*width; }
    public double calculatePeriemeter(){  return 2*(length+width); }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length:");
        double length=sc.nextDouble();
        System.out.println("enter width :");
        double width =sc.nextDouble();
        Rectangle_3 obj=new Rectangle_3(length,width);
        System.out.println(obj.getLength());
        System.out.println(obj.getWidth());
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculatePeriemeter());
    }
}
