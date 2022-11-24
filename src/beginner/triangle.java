package beginner;

import java.io.IOException;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double higher;
        double sum;
        boolean triangle;

        if (A > B && A > C) {
            higher = A;
        } else if (B > C) {
            higher = B;
        } else {
            higher = C;
        }

        if (higher == A) {
            sum = B + C;
        } else if (higher == B) {
            sum = A + C;
        } else {
            sum = B + A;
        }

        if (sum > higher) {
            triangle = true;
        } else {
            triangle = false;
        }

        if (triangle) {
            double perimetro = A + B + C;
            System.out.println(String.format("Perimetro = %.1f", perimetro));
        } else {
            double areaTrapezio = ((A + B) * C) / 2;
            System.out.println(String.format("Area = %.1f", areaTrapezio));
        }
    }
}
