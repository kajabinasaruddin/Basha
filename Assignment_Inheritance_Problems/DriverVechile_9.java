package Assignment_Inheritance_Problems;
import java.util.Scanner;
public class DriverVechile_9 {
    public static void main(String[] args) {
        System.out.println("1.car \n 2.Motorcycle \n 3.Truck \n enter the no:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        switch (no){
            case 1:
                       System.out.println("Enter car details");
                       Car_9 car=new Car_9();
                       car.display();
                       break;
            case 2:
                System.out.println("enter truck details");
                Truck_9 truck=new Truck_9();
                truck.display();
                break;
            case 3:
                System.out.println("enter motorcycle:");
                Motorcycle_9 motor=new Motorcycle_9();
                motor.display();
                break;  }  } }
