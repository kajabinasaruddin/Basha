package Assignment_Abstraction_Problems;
public class Triangle_2 extends Shape_2 {
    private int base;
    private int height;
    public Triangle_2(int base,int height){
        this.base=base;
        this.height=height;}
    @Override
    public void calculateArea() {
        System.out.println(0.5*(base*height));}
    @Override
    public void calculatePerimeter() {
        System.out.println(2*(base+height));}
    public static void main(String[] args) {
        Triangle_2 obj1=new Triangle_2(1,2);
        Triangle_2 obj2=new Triangle_2(1,3);
        obj1.calculateArea();
        obj2.calculatePerimeter();
    }
}
