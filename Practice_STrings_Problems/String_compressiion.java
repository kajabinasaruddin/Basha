package Practice_STrings_Problems;
public class String_compressiion {
    public static void main(String[] args) {
        String name="aaabbc";
        int len=name.length();
        int count=1;
        char current=name.charAt(0);
        for(int i=1;i<len;i++){
            if(name.charAt(i)==current){
                count++;
            }
            else {
                System.out.print(current+""+count);
                current=name.charAt(i);
                count=1;
            }
        }
        System.out.print(current+""+count);
    }
}
