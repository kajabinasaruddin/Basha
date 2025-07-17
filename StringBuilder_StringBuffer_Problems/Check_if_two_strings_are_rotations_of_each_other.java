package StringBuilder_StringBuffer_Problems;
import java.util.Scanner;
public class Check_if_two_strings_are_rotations_of_each_other {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        if(name1.length()==name2.length() && ((name1+name2).contains(name2))){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

}
