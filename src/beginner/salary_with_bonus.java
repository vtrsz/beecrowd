package beginner;

import java.io.IOException;
import java.util.Scanner;

public class salary_with_bonus {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        double sales = scanner.nextDouble();
        double total = salary + (sales * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}