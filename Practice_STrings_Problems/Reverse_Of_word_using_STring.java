package Practice_STrings_Problems;
import java.util.Scanner;
public class Reverse_Of_word_using_STring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String[] words=name.split(" ");
        String output="";
        for(int i= words.length-1;i>=0;i--){
            output+=words[i]+" ";
        }
        System.out.print(output+" ");
    }
}