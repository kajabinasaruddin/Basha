package Hackerrank_008;
import java.util.Scanner;
public class Pairs_in_a_List_that_Add_Up_to_a_Given_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    flag = true;
                    break;
                }
            }

        }
        System.out.println(flag);
    }
}
