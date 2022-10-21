package beginner;

import java.io.IOException;
import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        String quadrant = null;
        while (scanner.hasNext()) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if ((x == 0) || (y == 0)){
                break;
            } else if ((x > 0) && (y > 0)) {
                quadrant = "primeiro";
            } else if ((x < 0) && (y > 0)) {
                quadrant = "segundo";
            } else if (x < 0) {
                quadrant = "terceiro";
            } else {
                quadrant = "quarto";
            }
            System.out.println(quadrant);
        }
    }
}
