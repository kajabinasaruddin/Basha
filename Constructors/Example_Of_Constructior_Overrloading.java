package Constructors;
public class Example_Of_Constructior_Overrloading {
    Example_Of_Constructior_Overrloading(String first_name){

    }
    Example_Of_Constructior_Overrloading(String first_name,String last_name){

    }
    Example_Of_Constructior_Overrloading(String first_name,String last_name,int age){

    }

    public static void main(String[] args) {
        int n=40;
        String c=(n%2==0)? "even":"odd";
        System.out.println(c);

    }
}
