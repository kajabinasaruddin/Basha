package Inheritance_Practice;
public class Example_of_Inheritance2 extends Example_of_Inheritance1{
    public int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        //child to child
        System.out.println("child to child:");
        Example_of_Inheritance2 obj=new Example_of_Inheritance2();
        System.out.println(obj.First_name="alice");
        System.out.println(obj.last_name="bob");
        System.out.println(obj.add(10,20));
        System.out.println(obj.sub(20,10));
        System.out.println(obj.mul(10,20));

        //parent to parent
        System.out.println("Parent to parent:");
        Example_of_Inheritance1 obj1=new Example_of_Inheritance1();
        System.out.println(obj1.First_name="alice");
        System.out.println(obj1.last_name="bob");
        System.out.println(obj1.add(10,20));
        System.out.println(obj1.sub(20,10));
        //parent to child
        Example_of_Inheritance1 obj2=new Example_of_Inheritance2();
        System.out.println("Parent to child:");
        System.out.println(obj2.First_name="alice");
        System.out.println(obj2.last_name="bob");
        System.out.println(obj2.add(10,20));
        System.out.println(obj2.sub(20,10));
        //System.out.println(obj2.mul(10,20));
    }
}
