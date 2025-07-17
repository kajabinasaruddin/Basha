package Assignment_Inheritance_Problems;
import java.util.Scanner;
public class Vehicle_9 {
    private String make;
    private String model;
    private int year;
    private String fuel_type;
   public void details(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter make value :");
       make=sc.nextLine();
       System.out.println("enter model :");
       model=sc.nextLine();
       System.out.println("Enter year:");
       year=sc.nextInt();
       System.out.println("enter fuel type :");
      // sc.next();
       fuel_type=sc.next();
      // System.out.println(fuel_type);
   }
   public void dis(){
       System.out.println("make :"+make+"\n madel: "+model+"\n year: "+year+"\n fuel_type :"+fuel_type);
   }
}