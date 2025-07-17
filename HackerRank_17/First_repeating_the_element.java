package HackerRank_17;

import java.util.Scanner;

//7
//10 5 3 4 5 3 6
//Sample Output 0
//5
public class First_repeating_the_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        boolean f=false;
        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]==array[j]){
                   // System.out.println(array[i]);
                    f=true;
                    break;
                }
            }
            if(f){
                System.out.println(array[i]);
                break;
            }
        }
        if(!f){
            System.out.println(-1);
        }
    }
}
