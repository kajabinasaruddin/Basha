package Abstrat_class;
public class B extends A{
    @Override
    public int add() {
        return 100;
    }

    @Override
    public int add(int a, int b) {
        return a*b;
    }
}
