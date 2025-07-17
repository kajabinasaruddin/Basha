package HackerRank_014;
import java.util.Arrays;
import java.util.Scanner;
public class find_the_first_positive_missing_number {
    public static int missing(int[] nums){
        Arrays.sort(nums);
        int min=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min){
                break;
            }
            if(nums[i]==min){
                min=min+1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        find_the_first_positive_missing_number obj=new find_the_first_positive_missing_number();
        System.out.println(obj.missing(nums));
    }
}
