package HackerRank_13;
import java.util.Scanner;
//Sample Input 0
//5
//2 1 2 0 1
//Sample Output 0       0 1 1 2 2
public class Sort_an_array_of_0s_1s_and_2s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        int[] count=new int[3];
        for(int i=0;i< n;i++){
            count[array[i]]++;
        }
        for(int i=0;i<3;i++){
            for (int j=0;j<count[i];j++){
                System.out.print(i+" ");
            }
        }
    }
}
