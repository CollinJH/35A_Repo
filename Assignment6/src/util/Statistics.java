package util;
/*
Collin      Hargreaves
CIS 35A          00441
Assignment           5
Due         06-06-2023
Submitted   06-04-2023
*/

public class Statistics {
    

    private int[] lowScores;
    private int[] highScores;
    private float[] avgScores;

    public Statistics() {
        lowScores = new int[5];
        highScores = new int[5];
        avgScores = new float[5];
    }

    
    // calculates all stats for each quiz index, quiz 1 - 5
    public void calculateStats(Student[] students) {
        for (int i = 0; i < 5; i++) {
            findLow(students, i);
            findHigh(students, i);
            findAvg(students, i);
        }
    }

    // takes in array of student objects
    // takes in quiz index
    // will find the lowest score for the array of student objects for a specific quiz index
    public void findLow(Student[] student, int quizIndex) {
        
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < student.length; i++) {

            // if student at i is null the loop will stop
            // other wise will try to computer at null
            //this was depedent on the array size of students passed in
            if (student[i] == null) {
                break;
            }
            int[] quizScores = student[i].getQuizScores();
            if (quizIndex < quizScores.length) {
                int score = quizScores[quizIndex];
                if (score < lowest) {
                    lowest = score;
                }
            }
        }
        

        lowScores[quizIndex] = lowest;
    }

    // takes in array of student objects
    // takes in quiz index
    // will find the highest score for the array of student objects for a specific quiz index
    public void findHigh(Student[] student, int quizIndex) {
        
        int highest = Integer.MIN_VALUE;

        for (int i = 0; i < student.length; i++) {

             // if student at i is null the loop will stop
            // other wise will try to computer at null
            //this was depedent on the array size of students passed in
            if (student[i] == null) {
                break;
            }
            int[] quizScores = student[i].getQuizScores();
            int score = quizScores[quizIndex];
            if (score > highest) {
                highest = score;
            }
        }

        highScores[quizIndex] = highest;
    }

    // takes in array of student objects
    // takes in quiz index
    // will find the average score for the array of student objects for a specific quiz index
    public void findAvg(Student[] student, int quizIndex) {

        float average = 0;

        for (int i = 0; i < student.length; i++) {

             // if student at i is null the loop will stop
            // other wise will try to computer at null
            //this was depedent on the array size of students passed in
            if (student[i] == null) {
                break;
            }
            int[] quizScores = student[i].getQuizScores();
            int score = quizScores[quizIndex];

            average = score + average;
        }

        avgScores[quizIndex] = average / student.length;
    }


    public void printStats() {

        // print high scores out
        System.out.printf("High Scores: ");
        for (int i = 0; i < highScores.length; i++) {
            System.out.printf("%d%s", highScores[i], " ");
        }
        System.out.printf("\n");

        // print low scores out
        System.out.printf("Low Scores: ");
        for(int i = 0; i <lowScores.length; i++) {
            System.out.printf("%d%s", lowScores[i], " ");
        }
        System.out.printf("\n");

        // print avg scores out
        System.out.printf("Average Scores: ");
        for (int i = 0; i < avgScores.length; i++) {
            System.out.printf("%.2f%s", avgScores[i], " ");
        }
        System.out.printf("\n");
    }

    // methods used for serializing grades 

    public int findLowestQuizScore(Student student) {
        
        int lowest = Integer.MAX_VALUE;

        int[] quizScores = student.getQuizScores();
        for (int i = 0; i < quizScores.length; i++) {
            int score = quizScores[i];
            if (score < lowest) {
                lowest = score;
            } 
        }
        return lowest;
    }

    public int findHighestQuizScore(Student student) {
        
        int highest = Integer.MIN_VALUE;

        int[] quizScores = student.getQuizScores();
        for (int i = 0; i < quizScores.length; i++) {
            int score = quizScores[i];
            if (score > highest) {
                highest = score;
            } 
        }
        return highest;
    }

    public int findAverageQuizScore(Student student) {
    
        int average = 0;

        int[] quizScores = student.getQuizScores();
        for (int i = 0; i < quizScores.length; i++) {
            average = quizScores[i] + average;
        }
        return average / quizScores.length;
    }
}


