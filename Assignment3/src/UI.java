/* 
Collin      Hargreaves
CIS 35A          00441
Assignment           3
Due         05-21-2023
Submitted   05-21-2023
*/

import java.util.Scanner;

public class UI {
    
    public void play(Franchise f) {

        Scanner myScanner = new Scanner(System.in);
        int userPlay = 1;
        boolean reset = false;
        boolean correct = false;
        int storeChoice = 0;
        int printChoice = 0;
        f.calc();

        // choose a store to look at data from
        // if number is incorrect, make user try until input is correct
        while (!correct){
            System.out.printf("Please enter a store to check data on from 1 to 6: ");
            storeChoice = myScanner.nextInt();
            myScanner.nextLine();
            if ((storeChoice >= 1 && storeChoice <= 6)) {
                correct = true;
            } else {
                System.out.printf("You have entered an incorrect store number, try again \n");
            }
        }

        // while user still wants to continue
        // prompt user for option 1 - 8
        do {
            System.out.printf("Please select an option from 1 - 8!\n");
            System.out.printf("1. Total sales for each week \n");
            System.out.printf("2. Average daily sales for each week \n");
            System.out.printf("3. Total sales for all the weeks \n");
            System.out.printf("4. Average weekly sales \n");
            System.out.printf("5. Week with highest amount in sales \n");
            System.out.printf("6. Week with lowest amount in sales \n");
            System.out.printf("7. Print each option \n");
            System.out.printf("8. Print sales data \n");

            // get input from user
            // test if input is correct
            reset = false;
            while(!reset) {
                printChoice = myScanner.nextInt();
                myScanner.nextLine();
                if ((printChoice >= 1 && printChoice <= 8)) {
                    reset = true;
                } else {
                    System.out.printf("You have entered an incorrect option, try again \n");
                }
            }
            reset = false;
            
            // print out user's input
            f.getStores(storeChoice).print(printChoice);
            System.out.printf("%s%d%s", "For Store: ", storeChoice, "\n");

            // get input from user
            // test if input is correct
            while(!reset) {
                System.out.printf("Continue? Type 1: for yes, Type 2: for no) \n");
                userPlay = myScanner.nextInt();
                myScanner.nextLine();
                if ((userPlay >= 1 && userPlay <= 2)) {
                    reset = true;
                } else {
                    System.out.printf("You have entered an incorrect option, try again \n");
                }
            }

            reset = false;

        } while (userPlay == 1);


        myScanner.close();

    }
}


/*
 What happens in UI clas
 it should interact with franchise object

 f.getStores(3).print(7)

 write methods that enable to select user choice
 which store //#endregion
 what operation (1-7)

 based on the input you would print output
 f.getStores.print(7)
 */
