package Methods_Practice_Problems;
import java.util.Scanner;
public class Palindrome_number_or_not {
    public void isPalindrome(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=(rev*10)+digit;
            n/=10;
        }
        System.out.println(rev);
        if(temp == rev){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Palindrome_number_or_not obj=new Palindrome_number_or_not();
        obj.isPalindrome(n);
    }
}
