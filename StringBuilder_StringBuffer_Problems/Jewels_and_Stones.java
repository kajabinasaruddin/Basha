package StringBuilder_StringBuffer_Problems;
import java.util.Scanner;
public class Jewels_and_Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        int count = 0;
        for(int i=0;i<name2.length();i++){
            if(name1.indexOf(name2.charAt(i))!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
