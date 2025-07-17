package Abstrat_class;
//access Modifier+abstract+class keyword+class name
//abstract classes
public abstract class A {
    public abstract int add();//secure methods ,method signature,un impemented method
    public int add(int a,int b){
        return a+b;
    }
}
//abstract keyword is used to abstract class
//we cannot override the same class
//abstract class can have  both implemented(conrete method) and unimplmented method(without body)
//method without body -unimplemented
//abstract class cannot be instantiated
//create an object for abstract class
//abstract class(50% security).
//child class can extend abstract class
//child class object can access all methods from parent and child