package Assignment_Inheritance_Problems;
public class HRManager_4 extends Employee_4{
    @Override
    public void work(){
        System.out.println("works");
    }
    public void addEmployee(){
        System.out.println("add employee");
    }
    public static void main(String[] args) {
        HRManager_4 obj=new HRManager_4();
        obj.getSalary();
        obj.addEmployee();
        obj.work();
    }
}
