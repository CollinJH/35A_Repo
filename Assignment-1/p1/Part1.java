/*
Write a program to create a customer's bill for a company. The company sells only five different products: TV, VCR, Remote Controller, CD Player and Tape Recorder.
 The unit prices are $400.00, $220, $35.20, $300.00 and $150.00 respectively.
  The program must read the quantity of each piece of equipment purchased from the keyboard.
   It then, calculates the cost of each item, the subtotal and the total cost after an 8.25% sales tax.
    The input data consists of a set of integers representing the quantities of each item sold. These integers must be input into the program in a user- friendly way; that is,
     the program must prompt the user for each quantity as shown below - 
 
How many TV's were sold? 3 
How many VCR's were sold? 5 
How many remote controller's were sold? 1 
How many CD's were sold? 2 
How many Tape Recorder's were sold? 4 
 
The output of the program should print the following data properly formatted: 
 
        QTY  DESCRIPTION  UNIT PRICE  TOTAL PRICE 
 
             ...
 
                            SUBTOTAL 
                                 TAX 
                               TOTAL 
 
Define constants for the unit prices and the tax rate. Use integer variables to store the quantities for each item. Use floating-point variables to store the total price of each item, the bill subtotal, the tax amount and and the total amount of the bill. Run your program two times with the following data: 
 
 
Set 1 -> 2 1 4 1 2 
Set 2 -> 3 0 2 0 21 
 
Format the output adequately showing the 4 columns (QTY, DESCRIPTION, UNIT PRICE, TOTAL PRICE) in a single row. Use System.out.printf for output.
 */
import java.util.Scanner;


 public class Part1 {
        public static void main(String[] args) {
          
          // DATA SEGMENT

          // quantity variables
          int quantityTV = 0;
          int quantityVCR = 0;
          int quantityRmtCnt = 0;
          int quantityCD = 0;
          int quantityTapeRec = 0;

          // price variables
          final float priceTV = (float) 400.00;
          final float priceVCR = (float) 220;
          final float priceRmtCnt = (float) 35.20;
          final float priceCD =  (float) 300.00;
          final float priceTapeRec = (float) 150.00;

          // total price after processing 
          float  totalTV = 0;
          float  totalVCR = 0;
          float  totalRmtCnt = 0;
          float  totalCD = 0;
          float  totalTapeRec = 0;

          final float tax = (float) 0.085;
          float  total = 0;
          float  totalTax = 0;
          float  grandTotal = 0;

          // INPUT
          
           Scanner myScanner = new Scanner(System.in); // Create scanner object


          System.out.printf("How many TV's were sold? ");
          quantityTV = myScanner.nextInt();
          System.out.printf("How many VCR's were sold? ");
          quantityVCR = myScanner.nextInt();
          System.out.printf("How many remote controllers were sold? ");
          quantityRmtCnt = myScanner.nextInt();
          System.out.printf("How many CD's were sold? ");
          quantityCD = myScanner.nextInt();
          System.out.printf("How many tape recorders were sold? ");
          quantityTapeRec = myScanner.nextInt();

 
          // PROCESSING

          totalTV = quantityTV * priceTV;
          totalVCR = quantityVCR * priceVCR;
          totalRmtCnt = quantityRmtCnt * priceRmtCnt;
          totalCD = quantityCD * priceCD;
          totalTapeRec = quantityTapeRec * priceTapeRec;

          total = totalTV + totalVCR + totalRmtCnt + totalCD + totalTapeRec;
          totalTax = total * tax;
          grandTotal = total + tax;

          // PRINTING
          // Header
          System.out.printf("\t%2s\t%-16s%16s\t%s\n", "Qty", "Description", "Unit Price", "Total Price");
          System.out.printf("\t%2d\t%-16s\t%.2f\t%2s\t%.2f\n", quantityTV, "TV's", priceTV, "   ", totalTV);
          System.out.printf("\t%2d\t%-16s\t%.2f\t%2s\t%.2f\n", quantityTV, "VCR's", priceVCR, "   ", totalVCR);
          System.out.printf("\t%2d\t%-16s\t%.2f\t%2s\t%.2f\n", quantityTV, "Remote Controllers", priceRmtCnt, "   ", totalRmtCnt);
          System.out.printf("\t%2d\t%-16s\t%.2f\t%2s\t%.2f\n", quantityTV, "CD's", priceCD,"   ", totalCD);
          System.out.printf("\t%2d\t%-16s\t%.2f\t%2s\t%.2f\n\n", quantityTV, "Tape Recorders", priceTapeRec, "   ", totalTapeRec);
          System.out.printf("\t\t\t%23s\t\t%.2f\n", "Subtotal: ", total);
          System.out.printf("\t\t\t%23s\t\t%.2f\n", "Tax: ", totalTax);
          System.out.printf("\t\t\t%23s\t\t%.2f\n", "GrandTotal: ", grandTotal);


          myScanner.close();


          



        }

 }