package Assignment_Inheritance_Problems;
public class Employee_7 extends Person_7{
    private String EmployeeId;
    private String jobTitle;
    public Employee_7(String firstName,String lastName,String EmployeeId,String jobTitle){
        super(firstName,lastName);
        this.EmployeeId=EmployeeId;
        this.jobTitle=jobTitle;
    }
    public String getEmployeeId() {
        return EmployeeId;
    }
    @Override
    public String getLastName() {
        return super.getLastName() +"("+jobTitle+")";
    }
    public static void main(String[] args) {
        Employee_7 emp=new Employee_7("Alice","Bob","1111","trainer");
        System.out.println(emp.getFirstName());
        System.out.println(emp.getLastName());
        System.out.println(emp.EmployeeId);
        System.out.println(emp.jobTitle);
    }
}

