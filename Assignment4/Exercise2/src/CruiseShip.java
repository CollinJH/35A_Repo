/*
Collin      Hargreaves
CIS 35A          00441
Assignment           4
Due         05-29-2023
Submitted   05-29-2023
*/

package Exercise2.src;
import java.util.Arrays;

public class CruiseShip extends Ship {

    private double ticketPrice;
    private int numberOfRooms;
    private String[] buffetMenu;
    private String[] services;
    private String cruiseType;

    public CruiseShip(int capacity, int length, int width, String name, int height, String departureDate,
            String arrivalDate, String owner, double ticketPrice, int numberOfRooms, String[] buffetMenu,
            String[] services, String cruiseType, String departurePort, String arrivalPort) {


        super(capacity, length, width, name, height, departureDate, arrivalDate, owner, departurePort, arrivalPort);
        this.ticketPrice = ticketPrice;
        this.numberOfRooms = numberOfRooms;
        this.buffetMenu = buffetMenu;
        this.services = services;
        this.cruiseType = cruiseType;
        
    }

    // getters and setters 

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String[] getBuffetMenu() {
        return buffetMenu;
    }

    public void setBuffetMenu(String[] buffetMenu) {
        this.buffetMenu = buffetMenu;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    public String getCruiseType() {
        return cruiseType;
    }

    public void setCruiseType(String cruiseType) {
        this.cruiseType = cruiseType;
    }
    
    // overriding display info from class ship

    public void displayInfo() {
        super.displayInfo();
        System.out.printf("%s%s%s", "Ticket Price: " , ticketPrice, "\n");
        System.out.printf("%s%d%s", "Number of Rooms: " , numberOfRooms, "\n");
        System.out.printf("%s%s%s", "Buffet Menu: " , Arrays.toString(buffetMenu), "\n");
        System.out.printf("%s%s%s", "Services: " , Arrays.toString(services), "\n");
        System.out.printf("%s%s%s", "Cruise Type: " , cruiseType, "\n\n");
    }
    
}
