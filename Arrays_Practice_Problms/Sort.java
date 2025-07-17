package Arrays_Practice_Problms;
import java.util.Arrays;
import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for(int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
