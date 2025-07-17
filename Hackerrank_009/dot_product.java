package Hackerrank_009;
import java.util.Scanner;
public class dot_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            System.out.print(a[i]+" ");
        }
        int n1=sc.nextInt();
        int[] b=new int[n1];
        for(int j=0;j<n1;j++){
            b[j]=sc.nextInt();
            System.out.print(b[j]+" ");
        }
        for(int i=0;i<n && i<n1;i++){
            sum+=a[i]*b[i];
        }
        System.out.println("");
        System.out.println(sum);
    }
}
