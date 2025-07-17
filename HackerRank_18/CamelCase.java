package HackerRank_18;

import java.util.Scanner;

//Sample Input
//saveChangesInTheEditor
//Sample Output
//5
//String  contains five words:
//save
//Changes
//In
//The
//Editor
public class CamelCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
       // String[] words=name.split("\\s+");
        int count=1;
        for(int i=0;i< name.length();i++) {
            if(Character.isUpperCase(name.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
