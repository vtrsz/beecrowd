package beginner;

import java.io.IOException;
import java.util.Scanner;

public class binos_challenge {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers, actualNumber;
        int quantityOfmultipleOf2 = 0, quantityOfmultipleOf3 = 0, quantityOfmultipleOf4 = 0, quantityOfmultipleOf5 = 0;
        amountOfNumbers = scanner.nextInt();

        for (int i = 0; i < amountOfNumbers; i++) {
            actualNumber = scanner.nextInt();
            if ((actualNumber % 2) == 0) {
                quantityOfmultipleOf2++;
            }
            if ((actualNumber % 3) == 0) {
                quantityOfmultipleOf3++;
            }
            if ((actualNumber % 4) == 0) {
                quantityOfmultipleOf4++;
            }
            if ((actualNumber % 5) == 0) {
                quantityOfmultipleOf5++;
            }
        }
        System.out.printf("%01d Multiplo(s) de 2\n" +
                "%01d Multiplo(s) de 3\n" +
                "%01d Multiplo(s) de 4\n" +
                "%01d Multiplo(s) de 5\n", quantityOfmultipleOf2, quantityOfmultipleOf3, quantityOfmultipleOf4, quantityOfmultipleOf5);
    }
}
