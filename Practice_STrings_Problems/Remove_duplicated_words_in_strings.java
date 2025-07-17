package Practice_STrings_Problems;
import java.util.Scanner;
public class Remove_duplicated_words_in_strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String[] word=name.split(" ");
        for(int i=0;i<word.length;i++){

          for(int j=i+1;j<word.length;j++){
              if(word[i].equals(word[j]) && !word[i].equals("null")){
                  word[j]="null";
              }
          }
          if( i<=word.length-1 && !word[i].equals("null")){
              System.out.print(word[i]+" ");
          }
        }
    }
}