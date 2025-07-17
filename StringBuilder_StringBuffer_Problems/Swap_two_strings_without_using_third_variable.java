package StringBuilder_StringBuffer_Problems;
import java.util.Scanner;
public class Swap_two_strings_without_using_third_variable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        name1=name1+name2;
        name2=name1.substring(0,name1.length()-name2.length());
        name1=name1.substring(name2.length());
        System.out.println(name1);
        System.out.println(name2);
    }
}
