/*
Collin      Hargreaves
CIS 35A          00441
Assignment           5
Due         06-06-2023
Submitted   06-04-2023
*/


public class Student {

    // instance variables for sid, and quiz score array
    private int studentID;
    private int[] quizScores;
    
    // constructor
    public Student(int studentID, int[] quizScores) {
        this.studentID = studentID;
        this.quizScores = quizScores;
    }

    // getters and setter

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setQuizScores(int[] quizScores) {
        this.quizScores = quizScores;
    }

    public int getStudentID() {
        return studentID;
    }

    public int[] getQuizScores() {
        return quizScores;
    }

    // print values

    public void printValues() {
        System.out.printf("%d%s", studentID, " ");
        for (int i = 0; i < quizScores.length; i++) {
            System.out.printf("%d%s", quizScores[i], " ");
        }

        System.out.printf("\n");
    }
}
