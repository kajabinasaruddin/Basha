package Practice_STrings_Problems;
import java.util.Scanner;
public class First_Non_Repeating_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(name.indexOf(ch)== name.lastIndexOf(ch)){
                System.out.println(ch);
                return;
            }
        }
        System.out.println("no unique");
    }
}
