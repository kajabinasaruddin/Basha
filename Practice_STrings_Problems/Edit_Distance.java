package Practice_STrings_Problems;
public class Edit_Distance {
    public static void main(String[] args) {
        String name="horse";
        String name1="ros";
        int count=1;
        for(int i=1;i<name.length() && i<name1.length();i++){
            if(name.charAt(i)==name1.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
