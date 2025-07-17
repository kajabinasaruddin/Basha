package Methods_Practice_Problems;
public class Sum_of_digits_using_String_to_integer_convert {
    public static void main(String[] args) {
        String name="1234";
        int x=Integer.parseInt(name);
        System.out.println(x);
        int sum=0;
        while(x>0){
            int digit=x%10;
            sum+=digit;
            x/=10;
        }
        System.out.println("sum of numbers is:" +sum);
    }
}