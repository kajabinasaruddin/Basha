package HackerRank_012;
import java.util.Scanner;
//Sample Input 5
//0 1 0 3 12
//Sample Output 0   1 3 12 0 0
//Sample Input 1    4
//1 2 3 4
//Sample Output 1   1 2 3 4
//Sample Input 2    7
//1 2 0 4 5 0 6
//Sample Output 2   1 2 4 5 6 0 0
public class move_zeros_end {
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
            System.out.print(array[i]+" ");
        }
    }
}