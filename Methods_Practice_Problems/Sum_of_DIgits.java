package Methods_Practice_Problems;
import java.util.Scanner;
public class Sum_of_DIgits {
    public int sum(int n)
    {
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Sum_of_DIgits obj=new Sum_of_DIgits();
        System.out.println(obj.sum(n));
    }
}