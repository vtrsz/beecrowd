package beginner;

import java.io.IOException;
import java.util.Scanner;

public class time_conversion {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int timeInSeconds = scanner.nextInt();

        String time = String.format("%01d:%01d:%01d", timeInSeconds / 3600, (timeInSeconds % 3600) / 60, timeInSeconds % 60);
        System.out.println(time);
    }
}
