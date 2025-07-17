package Arrays_Practice_Problms;
import java.util.Arrays;
import java.util.Scanner;
public class Compare_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        int[] array1=new int[n];
        for(int i=0;i<n;i++){
            array1[i]=sc.nextInt();
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        if(Arrays.equals(array,array1)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
