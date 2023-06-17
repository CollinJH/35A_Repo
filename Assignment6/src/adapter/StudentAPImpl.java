package adapter;

import util.Statistics;
import util.Student;
import java.util.Arrays;

public class StudentAPImpl implements StudentAPI {
    
    private Student[] student;
    private Statistics statistic;

    public StudentAPImpl(Student[] student, Statistics statistics) {
        this.student = student;
        this.statistic = statistics;
    }

    public void printStudentStats() {

        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                break;
            }
            System.out.printf("%s%d%s", "Student ID: ", student[i].getStudentID(), "\n");
            System.out.printf("%s%s%s","Quiz Scores: ", Arrays.toString(student[i].getQuizScores()), "\n");
            System.out.printf("%s%d%s", "Lowest Score: ", statistic.findLowestQuizScore(student[i]), "\n");
            System.out.printf("%s%d%s","Highest Score: ", statistic.findHighestQuizScore(student[i]), "\n");
            System.out.printf("%s%d%s","Average Score: ", statistic.findAverageQuizScore(student[i]), "\n");
            System.out.printf("\n");
        }

    }

    public void printStatsForStudentID(int studentID){

        System.out.printf("%s%d%s","\nSearching for Student: ", studentID, "...\n");
        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                System.out.printf("Student not found...\n");
                break;
            }
            if (studentID == student[i].getStudentID()) {
                System.out.printf("Student found, Statistics: \n");
                System.out.printf("%s%s%s","Quiz Scores: ", Arrays.toString(student[i].getQuizScores()), "\n");
                System.out.printf("%s%d%s", "Lowest Score: ", statistic.findLowestQuizScore(student[i]), "\n");
                System.out.printf("%s%d%s","Highest Score: ", statistic.findHighestQuizScore(student[i]), "\n");
                System.out.printf("%s%d%s", "Average Score: ", statistic.findAverageQuizScore(student[i]), "\n");
                break;
            } 
        }


    }
}
