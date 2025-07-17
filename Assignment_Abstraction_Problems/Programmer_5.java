package Assignment_Abstraction_Problems;
public class Programmer_5 extends Employee_5{
    @Override
    public void calculateSalary() {
        System.out.println(4000);
    }
    @Override
    public void displayInfo() {
        System.out.println("Programmer information");
    }
    public static void main(String[] args) {
        Manager_5 obj=new Manager_5();
        Programmer_5 obj1=new Programmer_5();
        obj.calculateSalary();
        obj.displayInfo();
        obj1.calculateSalary();
        obj1.displayInfo();
    }
}
