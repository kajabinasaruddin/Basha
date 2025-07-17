package Methods_Practice_Problems;
import java.util.Scanner;
public class Palindrome_number_using_the_STring {
    public void isPalindrome(String name){
        int names=name.length();
        String rev="";
        for(int i=names-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        if(name.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Palindrome_number_using_the_STring  obj=new Palindrome_number_using_the_STring();
        obj.isPalindrome(name);
    }
}
