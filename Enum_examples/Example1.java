package Enum_examples;
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
public class Example1 {
    public static void main(String[] args) {
        Day today=Day.SUNDAY;
        System.out.println(today);
    }
}