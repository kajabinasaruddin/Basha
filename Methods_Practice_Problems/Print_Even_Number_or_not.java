package Methods_Practice_Problems;

public class Print_Even_Number_or_not {
    public Boolean isEven(int a){
        return a%2==0;
    }
    public static void main(String[] args) {
        Print_Even_Number_or_not obj=new Print_Even_Number_or_not();
        int a=10;
        if(obj.isEven(a)){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
