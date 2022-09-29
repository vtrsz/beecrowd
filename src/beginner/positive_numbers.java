package beginner;

import java.io.IOException;
import java.util.Scanner;

public class positive_numbers {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int positiveNumbers = 0;
        float[] numbers = new float[6];
        for (int i = 0; i < 6; i++){
            numbers[i] = scan.nextFloat();
            scan.nextLine();
            if (numbers[i] > 0) {
                positiveNumbers++;
            }
        }
        System.out.println(positiveNumbers + " valores positivos");
    }
}
