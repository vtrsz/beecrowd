package beginner;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class simple_sort {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] sortedNumbers = new int[3];
        int a, b, c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        scanner.close();

        sortedNumbers = new int[] {a, b, c};
        Arrays.sort(sortedNumbers);

        for (int number : sortedNumbers) {
            System.out.println(number);
        }

        System.out.println("");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}