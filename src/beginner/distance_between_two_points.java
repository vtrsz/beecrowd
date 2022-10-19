package beginner;

import java.io.IOException;
import java.util.Scanner;

public class distance_between_two_points {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double x1, y1, x2, y2;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        double distance = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        distance = Math.sqrt(distance);
        System.out.printf("%.4f\n", distance);
    }
}
