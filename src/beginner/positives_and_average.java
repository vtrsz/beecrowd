package beginner;

import java.io.IOException;
import java.util.Scanner;

public class positives_and_average {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int positiveNumbers = 0;
        double numbersTotal = 0;
        double[] numbers = new double[6];
        for (int i = 0; i < 6; i++){
            numbers[i] = scan.nextDouble();
            scan.nextLine();
            if (numbers[i] > 0) {
                positiveNumbers++;
                numbersTotal += numbers[i];
            }
        }
        System.out.println(positiveNumbers + " valores positivos");
        System.out.printf("%.1f\n", (numbersTotal/positiveNumbers));
    }
}
