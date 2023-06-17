package driver;

import exception.StudentGradingException;
import java.util.Arrays;

// tests studentgradingexception class
public class Driver1 {
    public static void main(String[] args) {
        int[] divisor = {5, 9, 6, 0, 0, 2};
        int[] dividend = {25, 72, 36, 4, 2, 0};

        System.out.printf("Attmepting to perform some division through two arrays\n");
        System.out.println(Arrays.toString(dividend));
        System.out.println(Arrays.toString(divisor));

        for (int i = 0; i < divisor.length; i++) {
            try {
                int result = performDivision(dividend[i], divisor[i]);
                System.out.println(result);
            } catch (StudentGradingException e) {
                System.out.printf(e.getMessage() + "\n");
            }
        }
    }

    public static int performDivision(int dividend, int divisor) throws StudentGradingException { 
        if (divisor == 0) {
            String message = "Attemtping to divide by zero: " + dividend + "/" + divisor;
            throw new StudentGradingException(message);
        }

        return dividend / divisor;

    }
}
