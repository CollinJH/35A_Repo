/* 

Collin      Hargreaves
CIS 35A          00441
Assignment           2
Due         05-14-2023
Submitted   05-14-2023

Design a HumanGenome class that holds the following information: genome name, 
number of genes in genome, number of chromosomes, number of cells in your body. 
Write appropriate methods (constructor, getters and setters and print) */

public class HumanGenome {

    // declare instance variables
    private String genomeName;
    private int numGenes;
    private int numChromosomes;
    private int numCells;

    public HumanGenome() {}

    // overloaded constructor
    public HumanGenome(String genomeName, int numGenes, int numChromosomes, int numCells) {
        this.genomeName = genomeName;
        this.numGenes = numGenes;
        this.numChromosomes = numChromosomes;
        this.numCells = numCells;
    }

    // SETTERS
    public void setGenomeName(String genomeName) {
        this.genomeName = genomeName;
    }

    public void setNumGenes(int numGenes) {
        this.numGenes = numGenes;
    }

    public void setNumChromosomes(int numChromosomes) {
        this.numChromosomes = numChromosomes;
    }
    public void setNumCells(int numCells) {
        this.numCells = numCells;
    }

    // GETTERS
    public String getGenomeName(String genomeName) {
        return genomeName;
    }

    public int getNumGenes(int numGenes) {
        return numGenes;
    }

    public int getNumChromosomes(int numChromosomes) {
        return numChromosomes;
    }

    public int getNumCells(int numCells) {
        return numCells;
    }

    public void print() {
        System.out.printf("%s", "\nPrinting Values \n");
        System.out.printf("%s%s%s", "Genome Name: ", genomeName, "\n");
        System.out.printf("%s%d%s", "Number of Genes: ", numGenes, "\n");
        System.out.printf("%s%d%s", "Number of Chromosomes: ", numChromosomes, "\n");
        System.out.printf("%s%d%s", "Number of Cells (Trillions): ", numCells, "\n\n");
    }

}
