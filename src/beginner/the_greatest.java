package beginner;

import java.io.IOException;
import java.util.Scanner;

public class the_greatest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int greatestNumber = 0;
        int number = 0;

        String line = scanner.nextLine();

        String[] allNumbers = line.split(" ");

        for (String value: allNumbers) {
            number = Integer.parseInt(value);
            if (number > greatestNumber) {
                greatestNumber = number;
            }
        }

        System.out.println(greatestNumber + " eh o maior");
    }
}
