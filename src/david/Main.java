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
                        if (z==0)
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


    public static void main(String[] args) {


        char start = 'X';
        int[] snake_x = {3, 4, 4, 5, 6, 7, 7};
        int[] snake_y = {4, 4, 5, 5, 5, 5, 4};
        print_playground(snake_x, snake_y);

//        char test = scan_char();
//        if (test == 'w') {
//            y--;
//        }
//        if (test == 's') {
//            y++;
//        }
//        if (test == 'a') {
//            x--;
//        }
//        if (test == 'd') {
//            x++;
//        }
//        print_playground(x, y);

    }

}
