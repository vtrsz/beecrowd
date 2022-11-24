package beginner;

import java.io.IOException;
import java.util.Scanner;

public class coordinates_of_a_point {
    public static void main(String[] args) throws IOException {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        if ((x == 0) && (y == 0)) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if ((x > 0) && (y > 0)) {
            System.out.println("Q1");
        } else if ((x < 0) && (y > 0)) {
            System.out.println("Q2");
        } else if ((x < 0) && (y < 0)) {
            System.out.println("Q3");
        } else if ((x > 0) && (y < 0)) {
            System.out.println("Q4");
        }
    }
}
