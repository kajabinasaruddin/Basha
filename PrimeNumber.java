import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("false");
            return;
        }
        if (n <= 3) {
            System.out.println("true");
            return;
        }boolean isPrime = true;
        for(int i=5;i<=n;i+=6){
            if(n%i ==0 || n%(i+2)==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}