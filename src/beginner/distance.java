package beginner;

import java.io.IOException;
import java.util.Scanner;

public class distance {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int distance;
        distance = scanner.nextInt();
        scanner.close();
        distance = distance * 2;
        System.out.println(distance + " minutos");
    }
}
