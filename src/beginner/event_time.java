package beginner;

import java.io.IOException;
import java.util.Scanner;

public class event_time {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String inputDay1 = scan.nextLine();
        String inputTime1 = scan.nextLine();
        String inputDay2 = scan.nextLine();
        String inputTime2 = scan.nextLine();

        String[] inputDay1Splitted = inputDay1.split(" ");
        int day1 = Integer.parseInt(inputDay1Splitted[1]);

        String[] inputTime1Splitted = inputTime1.split(" : ");
        int hour1 = Integer.parseInt(inputTime1Splitted[0]);
        int minute1 = Integer.parseInt(inputTime1Splitted[1]);
        int second1 = Integer.parseInt(inputTime1Splitted[2]);

        String[] inputDay2Splitted = inputDay2.split(" ");
        int day2 = Integer.parseInt(inputDay2Splitted[1]);

        String[] inputTime2Splitted = inputTime2.split(" : ");
        int hour2 = Integer.parseInt(inputTime2Splitted[0]);
        int minute2 = Integer.parseInt(inputTime2Splitted[1]);
        int second2 = Integer.parseInt(inputTime2Splitted[2]);

        int day = day2 - day1;
        int hour = hour2 - hour1;
        int minute = minute2 - minute1;
        int second = second2 - second1;

        if (second < 0) {
            second += 60;
            minute -= 1;
        }
        if (minute < 0) {
            minute += 60;
            hour -= 1;
        }
        if (hour < 0) {
            hour += 24;
            day -= 1;
        }

        System.out.println(day + " dia(s)");
        System.out.println(hour + " hora(s)");
        System.out.println(minute + " minuto(s)");
        System.out.println(second + " segundo(s)");

    }
}
