package beginner;

import java.io.IOException;
import java.util.Scanner;

public class average_ii {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextFloat();
        double y = scanner.nextFloat();
        double z = scanner.nextFloat();
        double average = ((x * 2) + (y * 3) + (z * 5)) / 10;
        System.out.printf("MEDIA = %.1f\n", average);
    }
}