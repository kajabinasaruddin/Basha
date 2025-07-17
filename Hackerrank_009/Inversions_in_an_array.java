package Hackerrank_009;
import java.util.Scanner;
public class Inversions_in_an_array {
    public static void main(String[] args) {
        /*
        Sample Input
        5
        2 4 1 3 5
        Sample Output
        3
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
