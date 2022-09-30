package beginner;

import java.io.IOException;
import java.util.Scanner;

public class salary {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        float value = scanner.nextFloat();
        float salary = hours * value;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}