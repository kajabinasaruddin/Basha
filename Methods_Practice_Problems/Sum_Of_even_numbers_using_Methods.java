package Methods_Practice_Problems;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class Sum_Of_even_numbers_using_Methods {
    public int sum(int n){
        int sum=0;
        for(int i=2;i<=n;i+=2){
            System.out.print(i+" ");
            sum+=i;
        }
        return  sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Sum_Of_even_numbers_using_Methods obj=new Sum_Of_even_numbers_using_Methods();
        System.out.println(obj.sum(n));
    }
}
