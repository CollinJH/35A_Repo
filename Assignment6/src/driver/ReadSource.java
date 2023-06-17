package driver;
/*
Collin      Hargreaves
CIS 35A          00441
Assignment           5
Due         06-06-2023
Submitted   06-04-2023
*/

import util.Statistics;
import util.Student;
import util.Utility;

public class ReadSource {

    public static void main(String[] args) {
        
                // create a new array of student objects 
                Student[] lab2 = new Student[40];
                Utility utility = new Utility("data.txt");
                Statistics statistics = new Statistics();

                // populate student array with data from file
                lab2 = utility.readFile(lab2);

                // calculate and print stats out for every student combined
                statistics.calculateStats(lab2);
                statistics.printStats();

    }
}