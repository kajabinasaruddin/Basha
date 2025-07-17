package Practice_STrings_Problems;
public class Fine_all_substring {
    public static void main(String[] args) {
        String name="abc";
        int len=name.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                System.out.print(name.substring(i,j)+" ");
            }
        }

    }
}
