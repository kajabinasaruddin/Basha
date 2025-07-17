package StringBuilder_StringBuffer_Problems;
import java.util.Scanner;
public class Vowels_COnsonant_OCunt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
       int vowels_count=0;
        int consonant_count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                    sb.append(ch);
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
