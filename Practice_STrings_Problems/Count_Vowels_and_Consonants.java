package Practice_STrings_Problems;
import java.util.Locale;
import java.util.Scanner;
public class Count_Vowels_and_Consonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
       int  vowels_count=0;
       int consonant_count=0;
        for(int i=0;i<name.length();i++){
            name=name.toLowerCase();
            char ch=name.charAt(i);
            if(ch >='a' && ch<='z' ){
                if(ch =='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                    vowels_count++;
                }
                else{
                    consonant_count++;
                }
            }
        }
        System.out.println(vowels_count);
        System.out.println(consonant_count);
    }
}