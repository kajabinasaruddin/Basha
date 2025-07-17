package HackerRank_19;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

//Sample Input 0
//6
//Sample Output 0
//6 3 10 5 16 8 4 2 1
//Explanation 0
//Starting from 6: 6 is even → 6 / 2 = 3 3 is odd → 3 × 3 + 1 = 10 10 is even → 10 / 2 = 5 5 is
// odd → 5 × 3 + 1 = 16 16 is even → 16 / 2 = 8 8 is even → 8 / 2 = 4 4 is even → 4 / 2 = 2 2 is
// even → 2 / 2 = 1 The sequence ends at 1
public class Collatz_sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int num;
//        int s;
        while(n!=1){
            System.out.print(n+" ");
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
        }
        System.out.print("1");
    }
}
