package Constructors;
public class Another_Example_of_Parametarized_Constructors {
    String name;
    int age;
     Another_Example_of_Parametarized_Constructors(String Name,int Age){
         this.name=Name;
         this.age=Age;
     }
    public static void main(String[] args) {
        Another_Example_of_Parametarized_Constructors obj = new Another_Example_of_Parametarized_Constructors("alice", 20);
        System.out.println(obj.name = "alice");
        System.out.println(obj.age=20);
    }
}