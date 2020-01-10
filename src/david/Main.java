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


    // todo: print apple
    static void print_playground(int[] snake_x, int[] snake_y, int apple_x, int apple_y) {
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

    static void move_snake(char move, int[] snake_x, int[] snake_y) {
        if (move != 'w' && move != 'a' && move != 's' && move != 'd')
            return;

        for (int z = snake_y.length - 1; z > 0; z--) {
            snake_y[z] = snake_y[z - 1];
            snake_x[z] = snake_x[z - 1];
        }
        if (move == 'w') {
            snake_y[0]--;
        }
        if (move == 's') {
            snake_y[0]++;
        }
        if (move == 'a') {
            snake_x[0]--;
        }
        if (move == 'd') {
            snake_x[0]++;
        }

    }

    static boolean game_over(int[] snake_x, int[] snake_y) {
        if (snake_x[0] >= COLS || snake_x[0] < 0 || snake_y[0] < 0 || snake_y[0] >= ROWS)
            return true;

        // Schlangentest
        for (int z = 1; z < snake_x.length; z++) {
            if (snake_x[0] == snake_x[z] && snake_y[0] == snake_y[z]) {
                return true;
            }
        }
        return false;
    }

    // todo: function apple_eaten ?
    // todo: function snake bigger machen :D
    // todo: function generate_apple (not in the snake!)

    public static void main(String[] args) {


        char start = 'X';
        int[] snake_x = {3, 4, 4, 5, 6, 7, 7};
        int[] snake_y = {4, 4, 5, 5, 5, 5, 4};
        print_playground(snake_x, snake_y);
        boolean running = true;
        while (!game_over(snake_x, snake_y)) {
            int random_a = (int) (Math.random() * 10);
            int random_b = (int) (Math.random() * 10);
            char move = scan_char();
            move_snake(move, snake_x, snake_y);
            print_playground(snake_x, snake_y);

        }
        println("Du hast verloren");
    }
}