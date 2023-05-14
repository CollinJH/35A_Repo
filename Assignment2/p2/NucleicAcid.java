/*
Collin      Hargreaves
CIS 35A          00441
Assignment           2
Due         05-14-2023
Submitted   05-14-2023

NucleicAcid.java - contains properties, constructors and properties as stated above. 
Also create a print() method printing value of each property as value name pairs in separate lines using printf().

Name - String
ChemicalFormula - String
Molarmass - float (and units can be added as a String (within printf())
Density - float (and units can be added as a String (within printf())
Write appropriate methods (constructor, getters, setters and print).  
Also create a print() method printing value of each property as value name pairs in separate lines using System.out.printf().

*/

package p2;

public class NucleicAcid {
    
    // Declare instance variables

    private String chemicalName;
    private String chemicalFormula;
    private float molarMass;
    private float density;

    // Default constructor
    public NucleicAcid() {}

    public NucleicAcid(String chemicalName, String chemicalFormula, float molarMass, float density) {

        this.chemicalName = chemicalName;
        this.chemicalFormula = chemicalFormula;
        this.molarMass = molarMass;
        this.density = density;

    }

    // Setters

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    public void setChemicalFormula(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }

    public void setMolarMass(float molarMass) {
        this.molarMass = molarMass;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    // Getters

    public String getChemicalName() {
        return chemicalName;
    }

    public String getChemicalFormula() {
        return chemicalFormula;
    }

    public float getMolarMass() {
        return molarMass;
    }

    public float getDensity() {
        return density;
    }


    // formatted print method
    
    public void print() {
        System.out.printf("%s%s", chemicalName,"\n");
        System.out.printf("%s%s%s", "    Chemical Formula - ", chemicalFormula, "\n");
        System.out.printf("%s%.2f%s", "    Molar Mass - ", molarMass, " g/mol\n");
        System.out.printf("%s%.2f%s", "    Density - ", density, " g/cm^3\n\n");
    }
}