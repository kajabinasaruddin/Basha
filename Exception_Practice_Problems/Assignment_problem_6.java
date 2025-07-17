package Exception_Practice_Problems;
public class Assignment_problem_6 {
    //Throws Keyword: Write a program where a method throws an exception using the throws keyword.
    public static void hello() throws Exception{
        throw new Exception("Hello, How are you");
    }
    public static void main(String[] args) {
        try {
            hello();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
