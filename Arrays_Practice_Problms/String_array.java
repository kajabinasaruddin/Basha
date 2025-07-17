package Arrays_Practice_Problms;
import java.util.Scanner;
public class String_array {
    // String name=["vj","vedhya","jill"]
    //output: 2 6 4 (count each character)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] name=new String[n];
        for(int i=0;i<n;i++){
            name[i]=sc.nextLine();
        }
        for(String na:name){
            System.out.print(na.length()+" ");
        }
    }
}
