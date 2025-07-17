package HackerRank_006;
import java.util.Scanner;
public class Prime_factorization_another_way {
     public  boolean isPrime(int n){
        if(n==2 || n==3)
            return true;
        if(n%2==0)
            return false;
        if(n%3==0)
            return false;
        for(int i=5;i<n;i=i+6)
        {
            if(n%i==0 || n%(i+1)==0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Prime_factorization_another_way obj=new
                Prime_factorization_another_way();
        for(int i=2;i<n/2;i++){
            while(n%i==0 && obj.isPrime(i)){
                System.out.println(i);
                n=n/i;
            }
        }
    }
}
