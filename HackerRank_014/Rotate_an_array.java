package HackerRank_014;
import java.util.Scanner;
public class Rotate_an_array {
    public static void main(String[] args) {
        /* Sample Input 0
            5
            1 2 3 4 5
            Sample Output 0
            5 1 2 3 4  */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array =new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        int last=array[n-1];
        for(int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
            array[i]=array[i-1];
        }
        array[0]=last;
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}