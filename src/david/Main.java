package david;

import java.util.Scanner;

public class Main {
    static final int ROWS = 9;
    static final int COLS = 9;

    static void println(String text) {
        System.out.println(text);
    }

    static void print(String text){
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

    static void printPlayground (char [][] playground) {

        int oben =0;
        for (oben=0;oben<COLS; oben++)
        {
            print("---");
        }
        println("--");

        for(int y=0; y<ROWS;y++){
            print("| ");
            for(int x=0; x<COLS;x++){

                print ("" + playground [y][x]);
                print("  ");
            }
            println("|");
        }
    int unten =0;
        for (unten=0;unten<COLS; unten++){
            print("___");
        }
        print("__");
    }

    public static void main(String[] args) {

	char [][] playground = new char[ROWS][COLS];
	for(int y=0; y<ROWS;y++){
	    for(int x=0; x<COLS;x++){
	        playground [y][x] = ' ';
        }
    }
	char snake = 'X';
	playground [4][4] = snake;
	printPlayground(playground);

	char test = scan_char();
	println("" +test);
    }
    
}
