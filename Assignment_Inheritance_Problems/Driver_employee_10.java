package Assignment_Inheritance_Problems;
import java.util.Scanner;
public class Driver_employee_10 {
    public static void main(String[] args) {
        System.out.println("1.manager \n 2.developer \n 3.Programmer \n enter the no:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        switch (no){
            case 1:
                System.out.println("Enter Manager details");
                Manager_10 obj=new Manager_10();
                obj.display();
                break;
            case 2:
                System.out.println("enter Developer details");
                Developer_10 obj1=new Developer_10();
                obj1.display();
                break;
            case 3:
                System.out.println("enter Programmer details:");
               Programmer_10 obj2=new Programmer_10();
               obj2.display();
                break;
        }
    }
}
