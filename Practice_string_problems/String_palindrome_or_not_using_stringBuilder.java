package Practice_string_problems;
import java.util.Scanner;
public class String_palindrome_or_not_using_stringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String temp=name;
        StringBuilder sb=new StringBuilder(name);
        System.out.println(sb.reverse());
        if (temp.equals(sb)) {

            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
