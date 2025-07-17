package HackerRank_16;
import java.util.Arrays;
import java.util.Scanner;
//Sample Input 0
//5
//3 3 4 2 4
//Sample Output 0
//3
//Explanation 0
//In this example, 3 appears twice, which is more than n/2 = 5/2 = 2 times, so 3 is the majority element.
public class Majority_Element_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[array.length/2]);
    }
}