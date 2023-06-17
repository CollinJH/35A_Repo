package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class StudentGradingException extends Exception {

    private static final String logFile = "src/exception/exception_log.txt";


    public StudentGradingException(String message) {
        super(message);
        logException(message);
        
    }

    private void logException(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))){
            writer.write(message);
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            System.out.printf("Failed to log exception: ");
            e.printStackTrace();
        }
    }
}