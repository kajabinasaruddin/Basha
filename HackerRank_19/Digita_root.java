package HackerRank_19;
import java.util.Scanner;
//Sample Input 0
//38
//Sample Output 0
//2
//Explanation 0 The sum of digits of 38 is 3 + 8 = 11. Since 11 is not a single digit, we sum the digits again: 1 + 1 = 2. The digital root of 38 is 2
public class Digita_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>9){
           int sum=0;
           while(n>0){
               int digit=n%10;
               sum+=digit;
               n/=10;
           }
            n=sum;
        }
        System.out.println(n);
    }
}
