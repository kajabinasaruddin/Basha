package HackerRank_13;
import java.util.Scanner;
//Sample Input 0        The quick brown fox
//Sample Output 0       fox brown quick The
//Sample Input 1        Hello World
//Sample Output 1       World Hello
//Sample Input          OpenAI    builds     AI    models
//Sample Output 2       models AI builds OpenAI
public class Reverse_the_order_of_words_in_a_sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String[] words=name.split("\\s+");
        for(int i= words.length-1;i>=0;i--){
            System.out.print(words[i]+"");
            if(i!=0){
                System.out.print(" ");
            }
        }
    }
}
