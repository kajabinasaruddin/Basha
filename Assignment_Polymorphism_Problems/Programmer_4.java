package Assignment_Polymorphism_Problems;
public class Programmer_4 extends Employee_4{
    @Override
    public void calculateSalary() {
        System.out.println("5000");
    }
    public static void main(String[] args) {
        Programmer_4 obj1=new Programmer_4();
        obj1.calculateSalary();
        Manager_4 obj=new Manager_4();
        obj.calculateSalary();
    }
}
