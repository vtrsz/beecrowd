package beginner;

import java.io.IOException;
import java.util.Scanner;

public class consumption {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        float kmTraveled = scanner.nextFloat();
        float fuelSpent = scanner.nextFloat();

        float kmPerLiter = kmTraveled / fuelSpent;

        System.out.printf("%.3f km/l\n", kmPerLiter);
    }
}
