package Numbers_Pattern;
import java.util.Scanner;
public class Basic_incrementing_Triangle_Pattern_Inverted__initialised {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
            }
            num++;
            System.out.println("");
        }
    }
}
