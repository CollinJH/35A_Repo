/*
Collin      Hargreaves
CIS 35A 	     00441
Assignment           1
Due         04-26-2023
Submitted   04-26-2023
*/

package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {

        // DATA SEGMENT
        int loanAmount;
        int loanYears;
   
        double annualInterestRate;
        double monthlyInterestRate;
        double monthlyPayment;
        double totalAmount;
        
        // INPUT

        Scanner scannerObj = new Scanner(System.in);

        System.out.printf("\nEnter Loan Amount: ");
        loanAmount = scannerObj.nextInt();

        System.out.printf("Enter Loan Length: ");
        loanYears = scannerObj.nextInt();

        System.out.printf("Enter Interest Rate: ");
        annualInterestRate = scannerObj.nextInt();

        // check for valid inputs
        
        checkInputValue(loanAmount, loanYears, annualInterestRate);

        // PROCESSING

        // calculate several values to be used in loop
        monthlyInterestRate = calculateMonthlyInterest(annualInterestRate);
        monthlyPayment = calculateMonthlyPayment(loanAmount, monthlyInterestRate, loanYears);
        totalAmount = calculateTotalAmount(monthlyPayment, loanYears);

        // PRINTING

        // printing out monthly payment and total amount owed
        printBoth(monthlyPayment, totalAmount);
        printHeader();

        // GENERATE FINAL AMORTIZATION SCHEDULE
        generateAmortizationSchedule(loanYears, monthlyInterestRate, monthlyPayment, loanAmount);

        scannerObj.close();
        
    } // end main method

    // method to check user input for negative values
    public static void checkInputValue(int amount, int year, double interest) {
        if (amount < 0) {
            throw new InputMismatchException("Loan Amount cannot be negative");
        } 
        if (year < 0) {
            throw new InputMismatchException("Loan Years cannot be negative");
        }
        if (interest < 0) {
            throw new InputMismatchException("Loan Interest Rate cannot be negative");
        }
    }



    // method to calculate monthly interest rate
    public static double calculateMonthlyInterest(double annualInterestRate) {

        double monthlyInterestRate;

        annualInterestRate /= 100;
        monthlyInterestRate = annualInterestRate / 12;
        
        return monthlyInterestRate;
    }
    // method to calculate monthly payment
    public static double calculateMonthlyPayment(double loanAmount, double monthlyInterestRate, double loanYears) {

        double monthlyPayment;
        double loanMonths = loanYears * 12;

        

        monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, loanMonths));
        

        return monthlyPayment;
    }

    // method to calculate total balance
    public static double calculateTotalAmount(double monthlyPayment, double loanYears) {
        double totalAmount;
        double loanMonths;

        loanMonths = loanYears * 12;
        totalAmount = monthlyPayment * loanMonths;

        return totalAmount;
    }

    // printing method for monthly payment and total balance
    public static void printBoth(double monthlyPayment, double totalAmount) {
        System.out.printf("%s%.2f%s", "\nMonthly Payment: ", monthlyPayment, "\n\n");
        System.out.printf("%s%.2f%s", "Total Amount: ", totalAmount, "\n\n");
    }

    // printing method for a header
    public static void printHeader() {
        System.out.printf("%15s%15s%15s%15s", "Payment#", "Interest", "Principal", "Balance\n");
    }

    // write a loop to calculate the amortization schedule
    // if balance is 0 print final payment, and show amount owed back to customer
    public static void generateAmortizationSchedule(int loanYears, double monthlyInterestRate, double monthlyPayment, double loanAmount) {

        double balance;
        double interest;
        double principal;

        balance = loanAmount;

        for (int i = 1; i <= loanYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%12d%16.2f%16.2f%15.2f%s", i, interest, principal, balance, "\n");




        }

    }
    
}
