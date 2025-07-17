package Assignment_Abstraction_Problems;
public class Cube_3 extends Shape3_6{
    private int radius;
    public Cube_3(int radius){
        this.radius=radius;}
    @Override
    public void calculateVolume() {
        System.out.println(Math.pow(radius,3));}
    @Override
    public void calculateSurfaceArea() {
        System.out.println(6* Math.pow(radius,2));}
    public static void main(String[] args) {
        Cube_3 obj=new Cube_3(5);
        obj.calculateVolume();
        obj.calculateSurfaceArea();
        Sphere_6 obj1=new Sphere_6(6);
        obj1.calculateVolume();
        obj1.calculateSurfaceArea();}}