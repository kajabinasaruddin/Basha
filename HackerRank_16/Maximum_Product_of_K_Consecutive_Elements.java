package HackerRank_16;

import java.util.Scanner;

//Sample Input
//8 3
//2 3 -2 4 -1 -2 5 6
//Sample Output
//10
//Explanation
//2 x 3 x -2 = -12 3 x -2 x 4 = -24 -2 x 4 x -1 = 8 4 x -1 x -2 = 8 -1 x -2 x 5 = 10 -2 x 5 x 6 = -60
//hence the highest value is 10
public class Maximum_Product_of_K_Consecutive_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] array=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int max_product=array[0];
        for(int i=0;i<n-k;i++){
            int product=1;
            for(int j=i;j<i+k;j++){
                product*=array[j];
                if(product>max_product){
                    max_product=product;
                }
            }
        }
        System.out.println(max_product);
    }
}
