package Practice_abstract_problems;
public class Project6 extends Prioject5{
    @Override
    public int hello() {
        return 10;
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Project6 obj=new Project6();
        System.out.println(obj.add(10,20));
        System.out.println(obj.hello());
    }
}
