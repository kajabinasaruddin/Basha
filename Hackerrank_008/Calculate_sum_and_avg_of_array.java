package Hackerrank_008;
import java.util.Scanner;
public class Calculate_sum_and_avg_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int sum=0;
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }
        System.out.println(sum);
        double avg=(float)sum/array.length;
        System.out.println(avg);
    }
}
