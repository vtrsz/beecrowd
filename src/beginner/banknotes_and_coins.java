package beginner;

import java.io.IOException;
import java.util.Scanner;

public class banknotes_and_coins {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int result;

        double money = scanner.nextDouble();

        int[] notes = {100, 50, 20, 10, 5, 2};
        int[] coins = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int note : notes) {
            result = (int) (money / note);
            money = money % note;
            System.out.printf("%1d nota(s) de R$ %.2f\n", result, (float) note);
        }

        System.out.println("MOEDAS:");
        money *= 100;
        for (int coin : coins) {
            result = (int) (((money) / coin));
            money = money % coin;
            System.out.printf("%1d moeda(s) de R$ %.2f\n", result, (float) coin/100);
        }
    }
}
