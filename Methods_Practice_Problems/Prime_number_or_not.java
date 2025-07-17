package Methods_Practice_Problems;
import java.util.Scanner;
public class Prime_number_or_not {
    public void isPrime(int n1,int n2){
        for(int n=n1;n<=n2;n++){
            if(n==1){
                System.out.print("");
                continue;
            }
            if(n<= 3){
                System.out.print(n+" ");
                continue;
            }
            if(n %2 ==0 || n%3 ==0){
                System.out.print("");
                continue;
            }
            for(int i=5;i<=n;i+=6){
                if(n%i==0 || n%(i+2)==0){
                    System.out.print(n+" ");
                }
                else{
                    System.out.print("");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Prime_number_or_not obj=new Prime_number_or_not();
        obj.isPrime(n1,n2);
    }
}
