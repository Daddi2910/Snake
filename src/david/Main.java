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


    static void print_playground(int[] snake_x, int[] snake_y) {
        print("┌");
        for (int oben = 0; oben < COLS; oben++) {
            print("───");
        }
        print("┐ \n");

        for (int y = 0; y < ROWS; y++) {
            print("│");
            for (int x = 0; x < COLS; x++) {

                char what_to_print = ' ';
                for (int z = 0; z < snake_x.length; z++) {

                    if (x == snake_x[z] && y == snake_y[z]) {
                        if (z == 0)
                            what_to_print = 'Ö';
                        else
                            what_to_print = '~';
                        break;
                    }
                }

                print(" " + what_to_print + " ");

            }
            println("│");
        }

        print("└");
        for (int unten = 0; unten < COLS; unten++) {
            print("───");
        }
        print("┘\n");
    }

    static void move_playground(char move, int[] snake_x, int[] snake_y) {

        if (move == 'w') {

            for (int z = snake_y.length-1; z >0; z--) {
                snake_y[z] = snake_y[z - 1];
                snake_x[z] = snake_x[z - 1];
            }
            snake_y[0]--;
        }
        if (move == 's') {
            for (int z = snake_x.length-1; z > 0; z--) {
                snake_y[z] = snake_y[z - 1];
                snake_x[z] = snake_x[z - 1];
            }
            snake_y[0]++;
        }
        if (move == 'a') {
            for (int z = snake_x.length-1; z > 0; z--) {
                snake_y[z] = snake_y[z - 1];
                snake_x[z] = snake_x[z - 1];
            }
            snake_x[0]--;
        }
        if (move == 'd') {
            for (int z = snake_x.length-1; z > 0; z--) {
                snake_y[z] = snake_y[z - 1];
                snake_x[z] = snake_x[z - 1];
            }
            snake_x[0]++;
        }

    }


    public static void main(String[] args) {


        char start = 'X';
        int[] snake_x = {3, 4, 4, 5, 6, 7, 7};
        int[] snake_y = {4, 4, 5, 5, 5, 5, 4};
        print_playground(snake_x, snake_y);
        boolean is_win = true;
        while (is_win) {
            char move = scan_char();
            move_playground(move, snake_x, snake_y);
            print_playground(snake_x, snake_y);

        }

    }
}