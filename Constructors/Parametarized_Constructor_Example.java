package Constructors;
import java.util.Scanner;
public class Parametarized_Constructor_Example {
    String firstName;
    String lastName;
    int age;
    Parametarized_Constructor_Example (String FirstName,String LastName,int Age){
        firstName=FirstName;
        lastName=LastName;
        age=Age;
    }
    public static void main(String[] args) {
        Parametarized_Constructor_Example obj=new Parametarized_Constructor_Example("alice","bob",20);
        Parametarized_Constructor_Example obj1=new Parametarized_Constructor_Example("alice","bob",20);
        System.out.println(obj.firstName);
        System.out.println(obj.lastName);
        System.out.println(obj.age);
        System.out.println(obj1.firstName);
        System.out.println(obj1.lastName);
        System.out.println(obj1.age);
    }
}
