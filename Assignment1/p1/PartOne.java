/*
Collin      Hargreaves
CIS 35A 	     00441
Assignment           1
Due         04-26-2023
Submitted   
*/

package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {

        // Data Segment
        int loanAmount;
        int loanYears;
   
        double annualInterestRate;
        double monthlyInterestRate;
        double monthlyPayment;
        double totalAmount;
        
        // Input

        Scanner scannerObj = new Scanner(System.in);

        System.out.printf("\nEnter Loan Amount: ");
        loanAmount = scannerObj.nextInt();

        System.out.printf("Enter Loan Length: ");
        loanYears = scannerObj.nextInt();

        System.out.printf("Enter Interest Rate: ");
        annualInterestRate = scannerObj.nextInt();

        // check for valid inputs
        
        checkInputValue(loanAmount, loanYears, annualInterestRate);

        // Processing

        // calculate several values to be used in loop
        monthlyInterestRate = calculateMonthlyInterest(annualInterestRate);
        monthlyPayment = calculateMonthlyPayment(loanAmount, monthlyInterestRate, loanYears);
        totalAmount = calculateTotalAmount(monthlyPayment, loanYears);

        // Printing

        // printing out monthly payment and total amount owed
        printBoth(monthlyPayment, totalAmount);
        printHeader();

        // generate final amortization schedule
        generateAmortizationSchedule(loanYears, monthlyInterestRate, monthlyPayment, totalAmount);

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

        System.out.println("Monthly Interest Rate = " + monthlyInterestRate);
        
        return monthlyInterestRate;
    }
    // method to calculate monthly payment
    public static double calculateMonthlyPayment(double loanAmount, double monthlyInterestRate, double loanYears) {

        double monthlyPayment;
        double i = monthlyInterestRate;
        double n = loanYears * 12;

        

        // monthlyPayment =  (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -n));
        // monthlyPayment = (loanAmount) * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, n))/ (Math.pow(1 + monthlyInterestRate, n) - 1) );
        

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
    public static void generateAmortizationSchedule(int loanYears, double monthlyInterestRate, double monthlyPayment, double totalAmount) {

        double balance;
        double interest;
        double remainder;
        double principal;

        balance = totalAmount;

        for (int i = 0; i <= loanYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            if (balance <= 0) {
                remainder = balance;
                remainder = remainder * (-1);
                balance = 0.0;
                System.out.printf("%12d%16.2f%16.2f%15.2f%s", i, interest, principal, balance, "\n");
                System.out.printf("%s%.2f%s", "\nWith a remainder of ",remainder, " from your last payment\n");
            } else {
            System.out.printf("%12d%16.2f%16.2f%15.2f%s", i, interest, principal, balance, "\n");
            }




        }

    }
    
}
