package david;

import java.util.Scanner;

public class Main {
    static final int ROWS = 10;
    static final int COLS = 10;

    static void println(String text) {
        System.out.println(text);
    }

    static void print(String text){
        System.out.printf(text);
    }

    static void printPlayground (char [][] playground) {
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
	        playground [y][x] = 'x';
        }
    }

	printPlayground(playground);
    }
    
}
