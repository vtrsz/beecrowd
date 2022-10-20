package beginner;

import java.io.IOException;
import java.util.Scanner;

public class bhaskara_formula {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, calculation;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        calculation = (b * b) - (4 * (a)*(c));
        if ((calculation > 0) && (a != 0)) {
            double x, y;
            calculation = Math.sqrt(calculation);
            x = (-b + calculation)/(2*a);
            y = (-b - calculation)/(2*a);
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", x, y);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
