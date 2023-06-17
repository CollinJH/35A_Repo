package util;
/*
Collin      Hargreaves
CIS 35A          00441
Assignment           5
Due         06-06-2023
Submitted   06-04-2023
*/


import java.io.*;
import java.util.StringTokenizer;

import exception.StudentGradingException;

public class Utility {
    
    private String fileName;

    // constructor instancing file name as a passed argument
    public Utility(String fileName) {
        this.fileName = fileName;
    }

    // array of student objects passed here
    // will read data file and populate array of objects

    public Student[] readFile(Student[] student) {

        try {
            FileReader file = new FileReader(fileName);
            BufferedReader buffer = new BufferedReader(file);
            int index = 0;
            boolean firstLine = true;
            String line;

            // will read until the line read is null
            // then the loop terminates

            while ((line = buffer.readLine()) != null) {

                // gets line past header
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                // tokenizer breaks down a whole line into tokens
                // each token will be separated from a space as shown by the delimiter
                // allows us to loop through the 6 token individually 
                // instead of one long line

                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                int studentID;
                int[] quizScores = new int[5];

                // using Integer.parseInt to use the tokens are integers
                // this is done so type is casted properly
                
                studentID = Integer.parseInt(tokenizer.nextToken());
                for (int i = 0; i < 5; i++) {
                    quizScores[i] = Integer.parseInt(tokenizer.nextToken());
                }


                // return an object and increment student index
                student[index++] = new Student(studentID, quizScores);
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return student;
    }

    // method will generate a file
    // file will contain serialized grade report for students
    public void serializeGrade(Student[] student, Statistics statistic) {
        try {
            StudentGrade gradefile = new StudentGrade();
            gradefile.GenerateStudentGrade(student, statistic);
        } catch (StudentGradingException e) {
            e.printStackTrace();
        }
    }
}
