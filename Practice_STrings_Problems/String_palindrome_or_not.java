package Practice_STrings_Problems;
import java.util.Scanner;
public class String_palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        StringBuilder sb=new StringBuilder(name);
        System.out.println(sb.reverse());
        if(name.equals(sb.toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
