package Tcs_Exam_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram_checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String name1=sc.nextLine();
        char[] ch1=name.toCharArray();
        char[] ch2=name1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("no anagram");
        }
    }
}
