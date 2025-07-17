package Assignment_Inheritance_Problems;
import java.util.Scanner;
public class Employee_10 {
    private String name;
    private String address;
    private int salary;
    private String jobtitle;
    public void details(){
      Scanner sc=new Scanner(System.in);
        System.out.println("enter a name:");
        name=sc.nextLine();
        System.out.println("enter address:");
        address=sc.nextLine();
        System.out.println("enter salary:");
        salary=sc.nextInt();
        sc.nextLine();
        System.out.println("enter jobtitle");
        jobtitle =sc.nextLine();
    }
    public void dis(){
        System.out.println("name :"+name+"\n address: "+address+"\n salary: "+salary+"\n jobtitle :"+jobtitle);
    }
}
