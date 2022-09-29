package beginner;

import java.io.IOException;
import java.util.Scanner;

public class extremely_basic {
    public static void main(String[] args) throws IOException {
        int firstInput = 0;
        int secondInput = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        firstInput = scanner.nextInt();
        secondInput = scanner.nextInt();
        result = firstInput + secondInput;
        System.out.println("X = " + result);
    }
}
