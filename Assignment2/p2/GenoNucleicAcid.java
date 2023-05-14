/*
Collin      Hargreaves
CIS 35A          00441
Assignment           2
Due         05-14-2023
Submitted   05-14-2023

GenoNucleicAcid.java (similar to the Driver program) - 
contains an input method (instance method) that uses Scanner for data input and returns a NucleicAcid instance. 
(Use the data stated above for instantiating Nucleic Acids).

*/
package p2;

import java.util.Scanner;

public class GenoNucleicAcid {

    // static scanner object
    static Scanner myScanner = new Scanner(System.in);

    // main driver
    public static void main(String[] args) {

        // create driver object
        GenoNucleicAcid d1 = new GenoNucleicAcid();

        // create 5 nucleic acid objects
        NucleicAcid Cytosine = d1.readValue();
        NucleicAcid Adenine = d1.readValue();
        NucleicAcid Guanine = d1.readValue();
        NucleicAcid Thymine = d1.readValue();
        NucleicAcid Uracil = d1.readValue();

        // print all nucleic acid objects
        Cytosine.print();
        Adenine.print();
        Guanine.print();
        Thymine.print();
        Uracil.print();

        
    }

    // instance method

    public NucleicAcid readValue() {

        // declare variables
        String chemicalName;
        String chemicalFormula;
        float molarMass;
        float density;

        // prompt user and read using scanner
        System.out.printf("Enter chemical name: ");
        chemicalName = myScanner.nextLine();
        System.out.printf("Enter chemical formula: ");
        chemicalFormula = myScanner.nextLine();
        System.out.printf("Enter molar mass: ");
        molarMass = myScanner.nextFloat();
        myScanner.nextLine();
        System.out.printf("Enter density: ");
        density = myScanner.nextFloat();
        myScanner.nextLine();
        System.out.printf("\n");

        // return new NucleicAcid object using overloaded constructor
        return new NucleicAcid(chemicalName, chemicalFormula, molarMass, density);

    }
}