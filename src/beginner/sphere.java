package beginner;

import java.io.IOException;
import java.util.Scanner;

public class sphere {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new  Scanner(System.in);
        double pi = 3.14159;

        double input = scanner.nextDouble();
        scanner.close();

        double result = (4.0/3.0) * pi * Math.pow(input, 3);
        System.out.printf("VOLUME = %.3f\n", result);
    }
}
