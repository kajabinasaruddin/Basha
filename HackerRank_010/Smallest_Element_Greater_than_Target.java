package HackerRank_010;
import java.util.Scanner;
public class Smallest_Element_Greater_than_Target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int mid;
        int res = -1;
        int target=sc.nextInt();
        while(left<=right){
            mid=(left+right)/2;
//            if(target== array[mid]){
//                System.out.println(mid);
//                return ;
//            }
            if(target<array[mid]){
                res = array[mid];
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println(res);
    }
}
