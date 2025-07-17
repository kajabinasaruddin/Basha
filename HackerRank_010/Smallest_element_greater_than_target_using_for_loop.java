package HackerRank_010;
import java.util.Scanner;
public class Smallest_element_greater_than_target_using_for_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(target<array[i]){
                System.out.println(array[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
