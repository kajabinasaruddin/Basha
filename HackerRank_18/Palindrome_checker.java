package HackerRank_18;
import java.util.Scanner;
//Sample Input 0    Was it a car or a cat I saw?
//Sample Output 0   True
//Sample Input 1    Able was I ere I saw Elba
//Sample Output 1   True
//Sample Input 2    Not a palindrome
//Sample Output 2   False
public class Palindrome_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder reversed = new StringBuilder(cleaned).reverse();
//        boolean isPalindrome = cleaned.toString().equals(reversed.toString());
//        System.out.println(isPalindrome);
        if((cleaned.toString()).equals(reversed.toString())){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}