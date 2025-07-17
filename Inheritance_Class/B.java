package Inheritance_Class;
public class B extends A{
    public int add() {
        return 11;
    }
    @Override
    public int add(int a,int b){
        return a*b;
    }
    String name="alice";
    public static void main(String[] args) {
//        //Parent to parent
//        A obj=new A();
//        System.out.println(obj.add(10,20));

        //child to child
//        B obj=new B();
//        System.out.println(obj.add());
//        System.out.println(obj.add(10,20));
//        System.out.println(obj.age);

        //parent to child
        A obj3=new B();
        System.out.println(obj3.age);
        System.out.println(obj3.add());
        System.out.println(obj3.add(10,20));
       // System.out.println(obj3.name);
    }
}