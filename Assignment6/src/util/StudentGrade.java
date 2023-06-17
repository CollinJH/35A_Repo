package util;

import exception.StudentGradingException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class StudentGrade {

    private static final String gradeFile = "student_grades.txt";

    public StudentGrade() {}


    public void GenerateStudentGrade(Student[] student, Statistics statistic) throws StudentGradingException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(gradeFile, false))) {
            for (int i = 0; i < student.length; i++) {
                if (student[i] == null) {
                    break;
                }

                writer.write("Student ID: " + student[i].getStudentID() + "\n");
                writer.write("Quiz Scores: " + Arrays.toString(student[i].getQuizScores()) + "\n");
                writer.write("Lowest Score: " + statistic.findLowestQuizScore(student[i]) + "\n");
                writer.write("Highest Score: " + statistic.findHighestQuizScore(student[i]) + "\n");
                writer.write("Average Score: " + statistic.findAverageQuizScore(student[i]) + "\n");
                writer.write("\n");
            }


        } catch (IOException e) {
            throw new StudentGradingException(e.getMessage());
        }

    }
}
