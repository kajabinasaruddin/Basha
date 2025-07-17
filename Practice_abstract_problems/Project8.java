package Practice_abstract_problems;
public class Project8 implements Project7{
    @Override
    public int add() {
        return 10;
    }

    @Override
    public void div() {
        System.out.println(20);
    }

    @Override
    public void mul() {
        System.out.println(40);
    }

    @Override
    public void sub() {
        System.out.println(50);
    }

    public static void main(String[] args) {
        Project8 obj=new Project8();
        System.out.println(obj.add());
        obj.mul();
        obj.div();
        obj.sub();
    }

}
