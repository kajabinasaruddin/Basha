package HackerRank_011;
import java.util.Scanner;
public class squares_numbers {
    public static void main(String[] args) {
        /*
        Sample Input
        5
        1 2 3 4 5
        Sample Output
        1 4
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int b=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            b=(int)Math.sqrt(array[i]);
            if(b*b == array[i]){
                System.out.print(array[i]+" ");
            }
        }
    }
}
