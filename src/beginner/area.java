package beginner;

import java.io.IOException;
import java.util.Scanner;

public class area {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        double triangleArea = (a * c) / 2;
        double circleRadiusArea = Math.pow(c, 2) * 3.14159;
        double trapeziumArea = ((a + b) * c) / 2;
        double squareArea = Math.pow(b, 2);
        double rectangleArea = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangleArea);
        System.out.printf("CIRCULO: %.3f\n", circleRadiusArea);
        System.out.printf("TRAPEZIO: %.3f\n", trapeziumArea);
        System.out.printf("QUADRADO: %.3f\n", squareArea);
        System.out.printf("RETANGULO: %.3f\n", rectangleArea);
    }
}