package david;

import java.util.Scanner;

public class Main {
    static final int ROWS = 9;
    static final int COLS = 9;

    static void println(String text) {
        System.out.println(text);
    }

    static void print(String text) {
        System.out.printf(text);
    }

    static char scan_char() {
        Scanner input = new Scanner((System.in));
        String s = input.nextLine();
        if (s.length() == 0)
            return '\n';
        char in = s.charAt(0);
        return in;
    }


    static void printPlayground(int snake_x, int snake_y) {

        for (int y = 0; y < ROWS; y++) {
            for (int x = 0; x < COLS; x++) {

                if (x == snake_x && y == snake_y) {
                    print("x");
                } else {
                    print("Ö");
                }

                print("│┌┐└┘─");
            }
        }
    }

    public static void main(String[] args) {


        char start = 'X';
        int x = 4;
        int y = 4;
        printPlayground(x, y);

        char test = scan_char();
        if (test == 'w') {
            y--;
        }
        printPlayground(x, y);

    }

}
