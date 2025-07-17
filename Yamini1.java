
//abstract class Yamini extends Kajabhi{
//    abstract int add(int a, int b);
//}
//class Kajabhi extends Yamini1 {
//    int add(int a, int b){
//        return a+b;
//    }
//public class Yamini1 {
//    public static void main(String[] args) {
//
//    }
//}
//}

abstract class Yamini extends Kajabhi {
    abstract int add(int a, int b);
}

class Kajabhi extends Yamini1 {
    @Override
    int add(int a, int b) {
        return a + b;
    }
}

public abstract class Yamini1 {
    public static void main(String[] args) {
        Kajabhi obj = new Kajabhi();
        int result = obj.add(10, 20);
        System.out.println("Sum: " + result);
    }
    abstract int add(int a, int b);
}

