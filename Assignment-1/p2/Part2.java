
/*
Collin      Hargreaves
CIS 35A 	     00441
Assignment          -1
Due         04-19-2023
Submitted   04-14-2023
*/

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {

        //DATA SEGMENT

        double userInput = 0;
        double fahrenheit = 0;
        double celcius = 0;

        //INPUT 1

        Scanner myScanner = new Scanner(System.in);

        System.out.printf("\nConverting Centigrade to Fahrenheit\n");
        System.out.printf("Please enter degrees in Centigrade: ");
        userInput = myScanner.nextDouble();

        //PROCESS 1

        fahrenheit = 32.0 + (userInput * (180.0/100.0));

        //OUTPUT 1

        System.out.printf("%s%.2f\n", "Converted into Fahrenheit: ", fahrenheit);

        //INPUT 2

        System.out.printf("\nConverting Fahrenheight to Centigrade\n");
        System.out.printf("Please enter degrees in Fahrenheit: ");
        userInput = myScanner.nextDouble();

        //PROCESS 2

        celcius = (userInput - 32) * (100.0/180.0);

        //OUTPUT 2

        System.out.printf("%s%.2f\n", "Fahrenheit converted into Centigrade: ", celcius);
        
        // close scanner

        myScanner.close();

    }
    
}
