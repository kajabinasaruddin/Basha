package Enum_examples;
enum block{
    JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOMBER,NOVEMBER,DECEMBER
}
public class Example3 {
    public static void main(String[] args) {
        block obj=block.FEBRUARY;
       // System.out.println(obj);
        switch (obj){
            case JANUARY :
                System.out.println("january");
                break;
            case FEBRUARY:
                System.out.println("february");
                break;
            case MARCH:
                System.out.println("march");
                break;
            case APRIL:
                System.out.println("april");
                break;
            case MAY:
                System.out.println("may");
                break;
            case JUNE:
                System.out.println("june");
                break;
            case JULY:
                System.out.println("july");
                break;
            case AUGUST:
                System.out.println("august");
                break;
            case SEPTEMBER:
                System.out.println("september");
                break;
            case OCTOMBER:
                System.out.println("octomber");
                break;
            case NOVEMBER:
                System.out.println("november");
                break;
            case DECEMBER:
                System.out.println("december");
                break;
            default:
                System.out.println("completed");
        }
    }
}
