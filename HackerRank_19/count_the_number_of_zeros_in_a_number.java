package HackerRank_19;
import java.util.Scanner;
//Sample Input 0
//10020
//Sample Output 0
//3
//Sample Input 1
//1234
//Sample Output 1
//0
public class count_the_number_of_zeros_in_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int count=0;
        for(char ch:name.toCharArray()){
            if(ch=='0'){
                count++;
            }
        }
        System.out.println(count);
        if(count!=0) {
            return;
        }
    }
}