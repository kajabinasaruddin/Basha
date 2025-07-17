package Assignment_Abstraction_Problems;
public class Circle_11 extends Shape_11{
    @Override
    public void draw() {
        System.out.println("draw the circle");
    }
    @Override
    public void resize() {
        System.out.println("resize the circle");
    }
    public static void main(String[] args) {
        Rectangle_11 obj=new Rectangle_11();
        obj.draw();
        obj.resize();
        Circle_11 obj1=new Circle_11();
        obj1.draw();
        obj1.resize();
    }
}
