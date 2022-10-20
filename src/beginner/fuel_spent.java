package beginner;

import java.io.IOException;
import java.util.Scanner;

public class fuel_spent {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int spentTimeInHours, averageSpeed;
        int carConsumption = 12;
        float distanceInKm, fuelSpent;
        spentTimeInHours = scanner.nextInt();
        averageSpeed = scanner.nextInt();

        distanceInKm = spentTimeInHours * averageSpeed;
        fuelSpent = distanceInKm / carConsumption;

        System.out.printf("%.3f\n", fuelSpent);
    }
}