package HackerRank_011;
import java.util.Arrays;
import java.util.Scanner;
public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        Arrays.sort(array);
        System.out.println("");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
