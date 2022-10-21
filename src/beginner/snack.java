package beginner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class snack {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int id, quantity;
        double totalValue;
        HashMap<Integer, Double> productsValue = new HashMap<Integer, Double>(5);
        productsValue.put(1, 4.00);
        productsValue.put(2, 4.50);
        productsValue.put(3, 5.00);
        productsValue.put(4, 2.00);
        productsValue.put(5, 1.50);

        id = scanner.nextInt();
        quantity = scanner.nextInt();
        totalValue = productsValue.get(id) * quantity;

        System.out.printf("Total: R$ %.2f\n", totalValue);
    }
}
