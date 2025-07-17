import java.util.Scanner;
public class First_non_repeating_characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String result=" ";
        for(int i=0;i<name.length()-1;i++){
            int count=0;
           if(name.charAt(i)!=' '){
               for(int j=0;j<name.length();j++){
                   if(name.charAt(i)==name.charAt(j) && i!=j){
                       count++;
                       break;
                   }
               }
           }
           if(count==0){
               result+=name.charAt(i);
           }

        }
        System.out.println(result);
    }
}
