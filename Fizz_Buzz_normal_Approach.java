import java.util.Scanner;
public class Fizz_Buzz_normal_Approach {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         String result="";
         for(int i=1;i<=n;i++){
             if(i%3==0 && i%5==0){
                result+="\"FizzBuzz\""+" ";
             }
             else if(i%3==0){
                 result+="\"Fizz\""+" ";
             }
             else if(i%5==0){
                 result+="\"Buzz\""+" ";
             }
             else{
                 result+="\""+i+"\""+" ";
             }
         }
        System.out.println(result);
    }
}