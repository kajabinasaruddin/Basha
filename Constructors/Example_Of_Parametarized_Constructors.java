package Constructors;
public class Example_Of_Parametarized_Constructors {
    String name;
    int age;
    Example_Of_Parametarized_Constructors(String names,int ages){
        this.name=names;
        this.age=ages;
    }
    public static void main(String[] args) {
        Example_Of_Parametarized_Constructors obj=new Example_Of_Parametarized_Constructors("alice",20);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
