package data_structures_and_libraries;

import java.io.IOException;
import java.util.Scanner;

public class parenthesis_balance_I {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int openParentheses = 0;
            int closeParentheses = 0;
            boolean correct = true;
            String str = scan.nextLine();

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == '(') {
                    openParentheses++;
                } else if (str.charAt(i) == ')') {
                    closeParentheses++;
                }

                if (str.charAt(i) == ')' && closeParentheses > openParentheses) {
                    correct = false;
                    break;
                } else if (((i + 1) == str.length()) && (str.charAt(i) == '(') && (openParentheses > closeParentheses)) {
                    correct = false;
                    break;
                }
            }
            if ((openParentheses == closeParentheses) && (correct)) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }
}
