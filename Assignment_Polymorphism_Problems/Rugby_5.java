package Assignment_Polymorphism_Problems;
public class Rugby_5 extends Sport_5{
    @Override
    public void play() {
        System.out.println("Playing Rugby!");
    }
    public static void main(String[] args) {
            FootBall_5 football = new FootBall_5();
            Basketball_5 basketball = new Basketball_5();
            Rugby_5 rugby = new Rugby_5();
            football.play();
            basketball.play();
            rugby.play();
    }
}
