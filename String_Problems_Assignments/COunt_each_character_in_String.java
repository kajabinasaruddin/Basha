package String_Problems_Assignments;
public class COunt_each_character_in_String {
    public static void main(String[] args) {
        String input = "khajabi";
        String counted = ""; // keeps track of already counted characters

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (counted.indexOf(currentChar) != -1) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    count++;
                }
            }
            System.out.println(currentChar + ": " + count);
            counted += currentChar; // mark as counted
        }
    }
}
