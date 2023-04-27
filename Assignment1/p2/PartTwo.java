/*
Collin      Hargreaves
CIS 35A 	     00441
Assignment           1
Due         04-26-2023
Submitted   04-26-2023
*/

package p2;

import java.util.Scanner;

public class PartTwo {

    
    public static void main(String[] args) {

        // DATA SEGMENT

        Scanner myScanner = new Scanner(System.in);
        long nInput;
        double result;

        // INPUT
        System.out.printf("Enter a square root to approximate: ");
        nInput = myScanner.nextLong();

        // PROCESSING
        result = sqrt(nInput);

        // PRINTING
        System.out.printf("%.2f%s", result, "\n");

        myScanner.close();

        
    }

    public static double sqrt(long n) {
        // result variable
        double result;

        // initializing first guess with 1 and 
        long lastGuess = 1;
        long nextGuess = n;

        // when nextGuess and lastGuess are almost identical
        // nextGuess is considered the approximate square root
        // so we set up a loop stating until nextGuess - lastGuess <= 0.0001
        // when that condition is satisfied we can consider nextGuess the approximate square root

        while (nextGuess - lastGuess > 0.0001) {
            nextGuess = (nextGuess + lastGuess) / 2;
            lastGuess = n / nextGuess;
        }

        // returning nextGuess as result

        result = nextGuess;

		return result;
    }
    
}
