package Assignment_Inheritance_Problems;
public class Shape_8 {
    //perimeter:2*PI*r
    //3.14*r^2
    public  double getPerimeter(int r,double pi){
        return 2*pi*r;
    }
    public double getArea(int r,double pi){
        return pi*Math.pow(r,2);
    }
}
