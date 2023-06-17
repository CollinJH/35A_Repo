package driver;

import util.Statistics;
import util.Student;
import util.Utility;

public class Driver2 {

    public static void main(String[] args) {
        
        Student[] lab2 = new Student[40];
        Utility utility = new Utility("data.txt");
        Statistics statistics = new Statistics();

        lab2 = utility.readFile(lab2);

        // serializes individual students statistics into a log file
        utility.serializeGrade(lab2, statistics);
    }

}
