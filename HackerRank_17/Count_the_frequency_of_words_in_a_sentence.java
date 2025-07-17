package HackerRank_17;
import java.util.Scanner;
//Hello world Hello everyone
//Sample Output 0
//hello: 2
//everyone: 1
//world: 1
public class Count_the_frequency_of_words_in_a_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        String[] words = sentence.split("\\s+");
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueCount = 0;

        for (int i = 0; i < words.length; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (words[i].equals(uniqueWords[j])) {
                    counts[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[uniqueCount] = words[i];
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueWords[i] + ": " + counts[i]);
        }
    }
}
