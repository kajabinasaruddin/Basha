package Assignment_Encpsulation_Problems;
import java.util.Scanner;
public class Employee_4 {
    private int employee_id;
    private String employee_name;
    private int employee_salary;
    public Employee_4(int employee_id, String employee_name, int employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }
    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public int getEmployee_salary() {
        return employee_salary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee_id:");
        int employee_id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee_name:");
        String employee_name = sc.nextLine();
        System.out.println("Enter employee_salary:");
        int employee_salary = sc.nextInt();
        Employee_4 obj = new Employee_4(employee_id, employee_name, employee_salary);
        System.out.println(obj.getEmployee_id());
        System.out.println(obj.getEmployee_name());
        System.out.println(obj.getEmployee_salary());
    }
}
