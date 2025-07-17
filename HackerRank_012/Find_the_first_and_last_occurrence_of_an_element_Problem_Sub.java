package HackerRank_012;
import java.util.Scanner;
//Sample Input 0    7       2 4 4 4 6 7 10      4
//Sample Output 0       1 3
//Sample Input 1        1      3        4
//Sample Output 1       -1 -1
public class Find_the_first_and_last_occurrence_of_an_element_Problem_Sub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        int first=-1;
        int last=-1;
        int target=sc.nextInt();
        for(int i=1;i< array.length;i++){
            if(array[i]==target){
                if(first == -1)
                    first=i;
                last=i;
            }
        }
        System.out.println(first+" "+last);
    }
}
