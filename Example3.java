import java.util.Scanner;
//import java.util.Scanner;
public class Example3 {
    // String s = "Program";
    //        char[] ch = s.toCharArray();
    //        boolean[] b = new boolean[s.length()];
    //
    //        System.out.println("Character Occurrences:");
    //        for (int i = 0; i < ch.length; i++) {
    //            if (b[i]) continue;     // Skip already counted characters
    //            int c = 1;
    //            for (int j = i + 1; j < ch.length; j++) {
    //                if (ch[i] == ch[j]) {
    //                    c++;
    //                    b[j] = true;     // Mark character as counted
    //                }
    //            }
    //            System.out.println(ch[i] + " : " + c);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char[] ch=name.toCharArray();
       boolean[] b = new boolean[name.length()];
        for (int i = 0; i < ch.length; i++) {
           if(b[i]) continue;
            int count = 1;
            for (int j = 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                  b[j]=true;
                }
            }
            System.out.println(name.charAt(i) + " " + count);
        }
    }
}
