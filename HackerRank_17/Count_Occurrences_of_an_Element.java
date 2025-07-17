package HackerRank_17;

import java.util.Scanner;

//Sample Input 0
//7
//1 2 3 2 4 2 5
//2
//Sample Output 0
//3
public class Count_Occurrences_of_an_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
