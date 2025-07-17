package HackerRank_011;

import java.util.Arrays;
import java.util.Scanner;

public class kth_smallest_element {
    /*
    Sample Input 0
    5
    7 10 4 3 20
    3
    Sample Output 0
    7
    Explanation 0
    the 3rd smallest element in the list is 7
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        int target=sc.nextInt();
        System.out.println(array[target-1]);
//        int left=0;
//        int right=n-1;
//        int mid;
//        while(left<=right){
//            mid=(left+right)/2;
//            if(target == array[mid]){
//                System.out.println(mid);
//                return;
//            }
//            if(target < array[mid]){
//                right=mid-1;
//            }
//            else{
//                left=mid+1;
//            }
//        }
//        System.out.println(-1);
    }
}