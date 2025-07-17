package HackerRank_13;

import java.util.Scanner;

//Sample Input 0
//3661
//Sample Output 0
//01:01:01
public class convert_seconds_to_hours_minutes_and_seconds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int seconds=n%60;
        int minutes=(n%3600)/60;
        int hour=n/3600;
        System.out.printf("%02d:%02d:%02d",seconds,minutes,hour);
    }
}
