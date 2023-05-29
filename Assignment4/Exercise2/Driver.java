/*
Collin      Hargreaves
CIS 35A          00441
Assignment           4
Due         05-29-2023
Submitted   05-29-2023
*/

package Exercise2;

public class Driver {

    public static void main(String[] args) {
        
        Ship[] ships = new Ship[3];

        

        ships[0] = new Ship(5000, 125, 30, "The Snailer",
         52, "2023-06-05", "2023-06-08", "Collin", "San Francisco", "South Korea");

        ships[1] = new CargoShip(15000, 150, 125, "ISS HaulsTUFF", 20,
        "2023-07-05", "2023-07-06", "James Conway", "Illegal Substances", 
        "Hand", 2, true, 2000000000, "Columbia", "New York");

        ships[2] = new CruiseShip(2500, 250, 150, "S.S. Tipton", 55, "2023-06-08", "2023-07-09", "London Tipton", 2000, 1200, 
        new String[]{"Grilled Chicken", "Protein Shakes", "Chicken Curry", "Crab Legs", "Fried Rice"}, 
        new String[]{"Massages", "Water Slides", "Comedy Shows", "Unlimited Ocean Watching", "Titanic Renactments"}, "Extended Cruise", "San Diego", "Hawaii");
        

        for (int i = 0; i <= 2; i++) {
            ships[i].displayInfo();
        }
    }
}