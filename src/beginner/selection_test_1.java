package beginner;

import java.io.IOException;
import java.util.Scanner;

public class selection_test_1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        if ((b > c) && (d > a) && (c + d) > (a + b) && (c > 0) && (d > 0) && ((a % 2) == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
