package p1;

import java.util.Scanner;
import java.math.*;

/*
 * annualInterestRate = annualInterestRate / 100;
i = monthlyInterestRate = annualInterestRate / 12;
n = numberOfYear * 12;
monthlyPayment = (loanAmount * i * Math.pow(i + 1, n)) / (Math.pow(i + 1, n) - 1);
totalPayment = monthlyPayment * 12;
 */

public class PartOne {
    public static void main(String[] args) {

        // Data Segment
        int loanAmount;
        int loanYears;
        double n;
        double annualInterestRate;

        double monthlyInterestRate;
        double monthlyPayment;
        double totalAmount;

        
        // Input
        Scanner scannerObj = new Scanner(System.in);

        System.out.printf("Enter Loan Amount: ");
        loanAmount = scannerObj.nextInt();

        System.out.printf("Enter Loan Length: ");
        loanYears = scannerObj.nextInt();

        System.out.printf("Enter Interest Rate: ");
        annualInterestRate = scannerObj.nextInt();

        // Processing

        annualInterestRate /= 100;
        monthlyInterestRate = annualInterestRate / 12;
        n = loanYears * 12;
        monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(monthlyInterestRate + 1, n) / (Math.pow(monthlyInterestRate + 1, n) - 1));
        totalAmount = monthlyPayment * 12;

        // write a loop to calculate the amortization schedule
        // interest = monthlyinterest * balance
        // principal = monthlypayment - interest
        // balance = balance - principal

        for (int i = 0; i <= loanYears; i++) {

        }

        // Printing

        // print out header
        System.out.printf("%5s%5s%5s%5s", "Payment#", "Interest", "Principal", "Balance");



        
    }
    
}
