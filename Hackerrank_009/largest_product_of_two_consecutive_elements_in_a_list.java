package Hackerrank_009;
import java.util.Scanner;
public class largest_product_of_two_consecutive_elements_in_a_list {
    public static void main(String[] args) {
        /*
        5
        1 2 3 4 5
        Sample Output
        20
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int max=array[0];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        for(int i=0;i<n-1;i++){
            if(max<array[i]*array[i+1]){
                max=array[i]*array[i+1];
            }
        }
        System.out.println("");
        System.out.println(max);
    }
}
