package Hackerrank_009;
import java.util.Scanner;
public class Find_all_possible_airs_f_a_in_a_list_that_give_a_product_greater_than_a_given_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        /*
        Sample Input 0
        5
        1 -2 3 -4 5
        4
        Sample Output 0
        true
         */
        int count=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        int target=sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]*array[j]>target){
                    count++;
                }
            }
        }if(count>0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
