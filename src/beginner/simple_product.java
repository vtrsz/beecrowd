package beginner;

import java.io.IOException;
import java.util.Scanner;

public class simple_product {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("PROD = " + (a*b));
    }
}