/* 
Collin      Hargreaves
CIS 35A          00441
Assignment           3
Due         05-21-2023
Submitted   05-21-2023
*/

import java.io.*;
import java.util.*;

public class FileIO {
	private String fname = null;
	private boolean DEBUG = false;

	public FileIO(String fname) {
		this.fname = fname;
	}


	// returns a franchise object
	public Franchise readData() {
		Franchise a1 = null;
		int counter = 0;
		try {
			// open file
			FileReader file = new FileReader(fname);
			// pass opened file to the buffer
			BufferedReader buff = new BufferedReader(file);
			// temp variable to read data into
			String temp;
			// flag for checking end of file
			boolean eof = false;
			while (!eof) {
				// read line into a local variable, line
				String line = buff.readLine();
				// increment, based on line number
				counter++;
				// if line is empty, we have reached end of file
				if (line == null)
					eof = true;
				else {
					if (DEBUG)
						System.out.println("Reading" + line);
					if (counter == 1) {
						// line goes into temp variable
						temp = line;
						// convert that string to integer and create new franchise object of stores
						a1 = new Franchise(Integer.parseInt(temp));

						// show that we set up that number of stores
						if (DEBUG)
							System.out.println("d  " + a1.numberofstores());
					}
					// do nothing if counter is 2
					if (counter == 2)
						;
					
					if (counter > 2) {
						// a1 - franchise object, counter - 3 to store the value to the 0 location, line for processing
						  	int x = buildStore(a1, (counter-3), line);
							if (DEBUG)
								System.out.println("Reading Store # "+(counter-2)+" Number of weeks read =  " +  x);
							if (DEBUG)
							{	
								System.out.println("Data read:");
								a1.getStores(counter-3).printdata();
							}
					}
				}
			}
			buff.close();
		} catch (Exception e) {
			System.out.println("Error -- " + e.toString());
		}
		return a1;
	}

	public int buildStore(Franchise a1, int counter, String temp) {
		Store tstore = new Store();
		String s1  =  "";
		float sale = 0.0f;
		int week = 0;
		int day = 0;
		StringTokenizer st = new StringTokenizer(temp);
		// while loop to cycle through tokens, incrementing week
	    while (st.hasMoreTokens()) {
			// this for loop cycles through the days of the week
			// day loop will loop 7 times then increment to the next week and run again
	         for(day=0;day<7;day++)
	         {
				// store next string token into s1
		    	 s1 = st.nextToken();
				 // parse the s1 string to a float and store in sale
		         sale = Float.parseFloat(s1);
				 // store each sale in its respective day and week
	        	 tstore.setsaleforweekdayintersection(week, day, sale);
	         }

			 // increment to next week
	         week++;
	    }
		a1.setStores(tstore, counter);
	    return week; 
	}
}
