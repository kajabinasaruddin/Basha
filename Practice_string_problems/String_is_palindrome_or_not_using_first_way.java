package Practice_string_problems;
import java.util.Scanner;
public class String_is_palindrome_or_not_using_first_way {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String temp=name;
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        System.out.println(rev);
        if(temp.equals(rev)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
