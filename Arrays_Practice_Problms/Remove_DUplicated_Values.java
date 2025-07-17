package Arrays_Practice_Problms;
import java.util.Scanner;
public class Remove_DUplicated_Values {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        System.out.println(array[0]+" ");
        for(int i=0;i< array.length;i++){
            if(array[i] != array[i-1]){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }
}
