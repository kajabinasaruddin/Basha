package Enum_examples;
enum Data {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
public class Example2 {
    public static void main(String[] args) {
        Data today=Data.SATURDAY;
        System.out.println(today);
        switch (today){
            case SUNDAY:
                System.out.println("sunday");
            case MONDAY:
                System.out.println("monday");
            case TUESDAY:
                System.out.println("tuesday");
            case WEDNESDAY:
                System.out.println("wednesday");
            case THURSDAY:
                System.out.println("thursday");
            case FRIDAY:
                System.out.println("friday");
            case SATURDAY:
                System.out.println("saturday");
            default:
                System.out.println("not completed");
        }
    }
}
