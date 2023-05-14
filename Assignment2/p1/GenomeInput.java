/*
Collin      Hargreaves
CIS 35A          00441
Assignment           2
Due         05-14-2023
Submitted   05-14-2023

Demonstrate the class by writing a program that creates three or more instances of this class 
(Name the instances using a disney character). 
You can populate information in each object using Scanner class. 
Please do not use any personal information as data in the project. 
 */
import java.util.Scanner;

 public class GenomeInput {

    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        GenomeInput d1 = new GenomeInput();
        HumanGenome Mulan = d1.readValue();
        Mulan.print();
        HumanGenome SnowWhite = d1.readValue();
        SnowWhite.print();
        HumanGenome Jasmine = d1.readValue();
        Jasmine.print();

    }

    public HumanGenome readValue() {
        
        // declare values for user to read into
        String genomeName;
        int numGenes;
        int numChromosomes;
        int numCells;

        System.out.printf("Enter genome name: ");
        genomeName = myScanner.nextLine();
        System.out.printf("Enter number of genes: ");
        numGenes = myScanner.nextInt();
        myScanner.nextLine();
        System.out.printf("Enter number of chromosomes: ");
        numChromosomes = myScanner.nextInt();
        myScanner.nextLine();
        System.out.printf("Enter number of cells (trillions): ");
        numCells = myScanner.nextInt();
        myScanner.nextLine();
        



        // return new object using overloaded constructor
        return new HumanGenome(genomeName, numGenes, numChromosomes, numCells);
    }
 }