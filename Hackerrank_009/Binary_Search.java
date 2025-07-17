package Hackerrank_009;
import java.util.Scanner;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int left=0;
        int right=n-1;
        int mid;
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]+" ");
        }
        int target=sc.nextInt();
        while(left<=right){
            mid=(left+right)/2;
            if(target == array[mid]){
                System.out.println(mid);
                return;
            }
            if(target<array[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println("-1");
    }
}