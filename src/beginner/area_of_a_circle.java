package beginner;

import java.io.IOException;
import java.util.Scanner;

class area_of_a_circle {
    public static void main(String[] args) throws IOException {
        double R = 0;
        double n = 3.14159;
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextDouble();
        result = n * (R * R);
        System.out.printf("A=%.4f",result);
    }
}