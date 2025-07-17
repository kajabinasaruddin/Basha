package Assignment_Abstraction_Problems;
public class Violin_10 extends Instrument_10{
    @Override
    public void play() {
        System.out.println("play Violin");
    }
    @Override
    public void tune() {
        System.out.println("Play tune");
    }
    public static void main(String[] args) {
        Glockenspiel_10 obj=new Glockenspiel_10();
        obj.play();
        obj.tune();
        Violin_10 obj1=new Violin_10();
        obj1.play();
        obj.tune();
    }
}
