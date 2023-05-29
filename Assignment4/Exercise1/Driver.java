/*
Collin      Hargreaves
CIS 35A          00441
Assignment           4
Due         05-29-2023
Submitted   05-29-2023
*/

package Exercise1;

public class Driver {
    public static void main(String[] args) {

        
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyAnnualInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("%s%.2f%s", "Saver 1 Balance: ", saver1.getSavingsBalance(), "\n");
        System.out.printf("%s%.2f%s", "Saver 2 Balance: ", saver2.getSavingsBalance(), "\n");

        SavingsAccount.modifyAnnualInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("%s%.2f%s", "Saver 1 Balance: ", saver1.getSavingsBalance(), "\n");
        System.out.printf("%s%.2f%s", "Saver 2 Balance: ", saver2.getSavingsBalance(), "\n");

        // end of part 1
    }
}
