/*
Collin      Hargreaves
CIS 35A 	       00441
Assignment          -1
Due         04-19-2023
Submitted   04-14-2023
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

          // prompt user for each product and store input
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

          // calculate totals by quantity * price
          totalTV = quantityTV * priceTV;
          totalVCR = quantityVCR * priceVCR;
          totalRmtCnt = quantityRmtCnt * priceRmtCnt;
          totalCD = quantityCD * priceCD;
          totalTapeRec = quantityTapeRec * priceTapeRec;

          // calculate subtotal, tax amount, and grandtotal

          total = totalTV + totalVCR + totalRmtCnt + totalCD + totalTapeRec;
          totalTax = total * tax;
          grandTotal = total + tax;

          // PRINTING
          // print header
          System.out.printf("\n\t%2s\t%2s\t%15s\t%17s\n", "QTY", "DESCRIPTION", "UNIT PRICE", "TOTAL PRICE");

          // output quantity purchased, product name, price, and total
          System.out.printf("\t%2d\t%-16s\t%.2f\t\t%.2f\n", quantityTV, "TV's", priceTV, totalTV);
          System.out.printf("\t%2d\t%-16s\t%.2f\t\t%.2f\n", quantityTV, "VCR's", priceVCR, totalVCR);
          System.out.printf("\t%2d\t%-16s\t%.2f\t\t%.2f\n", quantityTV, "Remote Controllers", priceRmtCnt, totalRmtCnt);
          System.out.printf("\t%2d\t%-16s\t%.2f\t\t%.2f\n", quantityTV, "CD's", priceCD, totalCD);
          System.out.printf("\t%2d\t%-16s\t%.2f\t\t%.2f\n\n", quantityTV, "Tape Recorders", priceTapeRec, totalTapeRec);

          // output subtotal, tax, and grandtotal
          System.out.printf("\t\t\t%23s\t\t%.2f\n", "SUBTOTAL: ", total);
          System.out.printf("\t\t\t%23s\t\t%.2f\n", "TAX: ", totalTax);
          System.out.printf("\t\t\t%23s\t\t%.2f\n", "GRANDTOTAL: ", grandTotal);

          // close scanner
          myScanner.close();


          



        }

 }