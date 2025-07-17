package Constructors;
public class Example_Of_nonParametarized_Constructors {
    String name;
    int age;
    Example_Of_nonParametarized_Constructors(){
        name="alice";
        age=20;
    }
    public static void main(String[] args) {
        Example_Of_nonParametarized_Constructors ex=new Example_Of_nonParametarized_Constructors();
        System.out.println(ex.age);
        System.out.println(ex.name);
    }
}
