package HackerRank_18;

import java.util.Scanner;

//Sample Input 0
//ababab
//ab
//Sample Output 0
//3
//Sample Input 1
//aaaaa
//aa
//Sample Output 1
//4
public class Count_the_occurrences_of_substring_in_string {
    public static int counts(String s,String sub){
        int count=0;
        for(int i=0;i<=s.length()-sub.length();i++){
            if(s.substring(i,i+sub.length()).equals(sub)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sub=sc.nextLine();
        System.out.println(counts(s,sub));
    }
}
