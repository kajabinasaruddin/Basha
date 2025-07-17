package HackerRank_006;
import java.util.Scanner;
public class Prime_Factorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num <= 1) {
            System.out.println("No prime factors");
            return;
        }
        while(num%2 == 0){
            System.out.println(2+" ");
            num=num/2;
        }
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                System.out.println(i + " ");
                num /= i;
            }
        }
        if (num > 2) {
            System.out.print(num);
        }
        System.out.println("");
    }
}
