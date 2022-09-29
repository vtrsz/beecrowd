package beginner;

import java.io.IOException;
import java.util.Scanner;

public class odd_numbers {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = 1; i <= input; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }
    }
}
