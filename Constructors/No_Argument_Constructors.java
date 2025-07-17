package Constructors;
public class No_Argument_Constructors {
    String Firstname;
    String lastName;
    int age;
    No_Argument_Constructors(){
        Firstname="alice";
        lastName="bob";
        age=20;
    }
    public static void main(String[] args) {
        No_Argument_Constructors obj=new No_Argument_Constructors();
        System.out.println(obj.Firstname);
        System.out.println(obj.lastName);

    }
}
