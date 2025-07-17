package HackerRank_19;
import java.util.Scanner;
//Sample Input 0
//145
//Sample Output 0
//true
//Explanation 0
//The sum of the factorials of the digits of 145 145 is: 1!+4!+5!=1+24+120=145. Since the sum equals 145 145, it is a strong number.
public class Strong_number {
    public static int factorial_exp(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int or=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=factorial_exp(digit);
            n/=10;
        }
        if(or==sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
