package beginner;

import java.io.IOException;

public class even_numbers {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 100; i++){
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}
