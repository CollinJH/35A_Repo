/*
Collin      Hargreaves
CIS 35A          00441
Assignment           4
Due         05-29-2023
Submitted   05-29-2023
*/

package Exercise2.src;

public class CargoShip extends Ship {

    private String cargoType;
    private String loadingMethod;
    private int numberOfCranes;
    private boolean contraband;
    private int cargoValue;

    public CargoShip(int capacity, int length, int width, String name, int height, String departureDate,
            String arrivalDate, String owner, String cargoType, String loadingMethod, int numberOfCranes, 
            boolean contraband, int cargoValue, String departurePort, String arrivalPort) {


        super(capacity, length, width, name, height, departureDate, arrivalDate, owner, departurePort, arrivalPort);
        this.cargoType = cargoType;
        this.loadingMethod = loadingMethod;
        this.numberOfCranes = numberOfCranes;
        this.contraband = contraband;
        this.cargoValue = cargoValue;
        

    }

    // getters and setters

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getLoadingMethod() {
        return loadingMethod;
    }

    public void setLoadingMethod(String loadingMethod) {
        this.loadingMethod = loadingMethod;
    }

    public int getNumberOfCranes() {
        return numberOfCranes;
    }

    public void setNumberOfCranes(int numberOfCranes) {
        this.numberOfCranes = numberOfCranes;
    }

    public boolean isContraband() {
        return contraband;
    }

    public void setContraband(boolean contraband) {
        this.contraband = contraband;
    }

    public int getCargoValue() {
        return cargoValue;
    }

    public void setCargoValue(int cargoValue) {
        this.cargoValue = cargoValue;
    }

    // overriding display info from class ship

    public void displayInfo() {
        super.displayInfo();
        System.out.printf("%s%s%s", "Cargo Type: ", cargoType, "\n");
        System.out.printf("%s%s%s", "Loading Method: ",loadingMethod, "\n");
        System.out.printf("%s%d%s", "Number of Cranes: ", numberOfCranes, "\n");
        System.out.printf("%s%b%s", "Contraband: ", contraband, "\n");
        System.out.printf("%s%d%s", "Cargo Value: ", cargoValue, "\n");
    }


}