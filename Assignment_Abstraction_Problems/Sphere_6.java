package Assignment_Abstraction_Problems;
public class Sphere_6 extends Shape3_6{
    private int radius;
    public Sphere_6(int radius){
        this.radius=radius;
    }
    @Override
    public void calculateVolume() {
        double pi=3.14;
        System.out.println((4/3)*pi*Math.pow(radius,3));
    }
    @Override
    public void calculateSurfaceArea() {
        double pi=3.14;
        System.out.println(4*pi*Math.pow(radius,2));
    }
}
