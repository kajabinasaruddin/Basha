package Assignment_Polymorphism_Problems;
public class Square_8 extends Shape_8{
    private double side;

    public Square_8(double side) {
        this.side = side;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }
    @Override
    public double calculateArea() {
        return side * side;  // Area = side²
    }

}
