package beginner;

import java.io.IOException;
import java.util.Scanner;

public class simple_calculate {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int productId = 0;
        int quantity = 0;
        float price = 0f;
        float totalPrice = 0f;

        while(true) {
            if (!scanner.hasNext()) {
                break;
            }
            productId = Integer.parseInt(scanner.next());
            quantity = Integer.parseInt(scanner.next());
            price = Float.parseFloat(scanner.next());

            totalPrice += quantity * price;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPrice);
    }
}