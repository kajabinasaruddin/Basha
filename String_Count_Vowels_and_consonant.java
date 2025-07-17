import java.util.Scanner;
public class String_Count_Vowels_and_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int vowels_count = 0;
        int consonant_count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.print(ch + "");
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels_count++;
            } else {
                consonant_count++;
            }
        }
        System.out.println("");
        System.out.println(vowels_count);
        System.out.println(consonant_count);
    }
}