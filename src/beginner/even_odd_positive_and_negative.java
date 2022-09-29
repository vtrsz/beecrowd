package beginner;

import java.io.IOException;
import java.util.Scanner;

public class even_odd_positive_and_negative {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int evenNumbers = 0;
        int oddNumbers = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        double[] numbers = new double[5];
        for (int i = 0; i < 5; i++){
            numbers[i] = scan.nextDouble();
            scan.nextLine();
            if ((numbers[i] % 2) == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            if (numbers[i] > 0) {
                positiveNumbers++;
            } else if (numbers[i] < 0) {
                negativeNumbers++;
            }
        }
        System.out.println(evenNumbers + " valor(es) par(es)");
        System.out.println(oddNumbers + " valor(es) impar(es)");
        System.out.println(positiveNumbers + " valor(es) positivo(s)");
        System.out.println(negativeNumbers + " valor(es) negativo(s)");
    }
}
