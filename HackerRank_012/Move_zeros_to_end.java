package HackerRank_012;
import java.util.Scanner;
public class Move_zeros_to_end {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            if(array[i]!=0){

                array[count++]=array[i];
            }
        }
        while(count<n){
            array[count++]=0;
        }
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
