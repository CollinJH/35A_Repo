/* 
Collin      Hargreaves
CIS 35A          00441
Assignment           3
Due         05-21-2023
Submitted   05-21-2023
*/

public class Driver {

	public static void main(String[] args) {

        FileIO a1 = new FileIO("/Users/collinj/programming/Java/35A_Repo/Assignment3/Salesdat.txt");
		Franchise f = a1.readData();


		UI ui = new UI();

		// pass in franchise object to play
		ui.play(f);


		// f.calc();
		// ready for UI
		// UI ui = new UI();
		// ui.play();
	}

}
