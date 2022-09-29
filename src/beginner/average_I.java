package beginner;

import java.io.IOException;
import java.util.Scanner;

public class average_I {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        float media1 = scanner.nextFloat() * 3.5f;
        float media2 = scanner.nextFloat() * 7.5f;
        System.out.printf("MEDIA = %.5f\n" ,((media1+media2)/11));
    }
}
