package string_builder_methods;
import java.util.Scanner;
public class String_Buffer_Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        StringBuffer sb=new StringBuffer();
        sb.append(name);
        sb.append("hello");
        System.out.println(sb);
    }
}
