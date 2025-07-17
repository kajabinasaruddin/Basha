package Practice_STrings_Problems;
public class StringsExamples {
    public static void main(String[] args) {
        String name = "hello faangtech lab";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.replace('l', 'k'));
        System.out.println(name.replace('a', 'z'));
        System.out.println(name.lastIndexOf('b'));
        System.out.println(name.indexOf('l'));
        String s="hello";
        int count=0;
        char chs;
        char[] ch=new char[s.length()];
        for(int i=0;i< s.length();i++){
            //count each characters in a string
            chs= s.charAt(i);
        }
//        for(int i=1;i<chs.length;i++){
//            ch[count]++;}
//        System.out.println(count);
        //string is immutable or not
        //find the length of the string()
        //character vs string
        //reverse a string
        //what is anagram (if two string characters are equal or not)
        //
    }
}
