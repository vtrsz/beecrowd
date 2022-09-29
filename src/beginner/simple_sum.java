package beginner;

import java.io.IOException;
import java.util.Scanner;

public class simple_sum {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a + b;
        System.out.println("SOMA = " + result);
    }
}