/*
Collin      Hargreaves
CIS 35A 	     00441
Assignment           1
Due         04-26-2023
Submitted   
*/

package p2;

import java.util.Scanner;

public class PartTwo {

    // main function will just run sqrt method
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        long nInput;
        double result;

        System.out.printf("Enter a square root to approximate: ");
        nInput = myScanner.nextLong();

        result = sqrt(nInput);
        System.out.printf("%.2f%s", result, "\n");

        myScanner.close();

        
    }

    public static double sqrt(long n) {
        double result;

        // initializing first guess with 1
        long lastGuess = 1;
        long nextGuess = n;

        while (nextGuess - lastGuess > 0.0001) {
            nextGuess = (nextGuess + lastGuess) / 2;
            lastGuess = n / nextGuess;
        }

        result = nextGuess;

		return result;
    }
    
}
