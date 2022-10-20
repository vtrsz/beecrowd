package beginner;

import java.io.IOException;
import java.util.Scanner;

public class age_in_days {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int years, days, months;
        int inputDays = scanner.nextInt();

        years = inputDays / 365;
        months = (inputDays % 365) / 30;
        days = inputDays - (years * 365) - (months * 30);
        String result = String.format("%01d ano(s)\n%01d mes(es)\n%01d dia(s)", years, months, days);
        System.out.println(result);
    }
}