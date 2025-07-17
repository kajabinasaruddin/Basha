package Patterns;
import java.util.Scanner;
public class Right_angled_two_number_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                if(nums<=9){
                    System.out.print("0"+ nums+" ");
                }
                else{
                    System.out.print(nums+" ");
                }
                nums++;
            }
            System.out.println("");

        }
    }
}
