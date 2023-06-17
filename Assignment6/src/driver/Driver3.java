package driver;

import util.Statistics;
import util.Student;
import util.Utility;
import adapter.StudentAPI;
import adapter.StudentAPImpl;

public class Driver3 {
    public static void main(String[] args) {
        
        Student[] lab2 = new Student[40];
        Utility utility = new Utility("data.txt");
        Statistics statistics = new Statistics();
        StudentAPI adapter = new StudentAPImpl(lab2, statistics);

        lab2 = utility.readFile(lab2);

        // utilizing API print out stats for all students
        adapter.printStudentStats();

        // print stats for a single student
        adapter.printStatsForStudentID(1234);
        adapter.printStatsForStudentID(8026);

        // this one will not be found
        adapter.printStatsForStudentID(3920);
    }
}
