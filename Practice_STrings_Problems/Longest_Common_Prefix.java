package Practice_STrings_Problems;
import java.util.Arrays;
public class Longest_Common_Prefix {
    public static void main(String[] args) {
       String[] name={"flower", "flow", "flight"};
        Arrays.sort(name);
        String first=name[0];
        String last=name[name.length-1];
        String result="";
        for(int i=0;i<first.length() && i<last.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                result+=first.charAt(i);
            }
        }
        System.out.println(result);
    }
}
