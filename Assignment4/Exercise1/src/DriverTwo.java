/*
Collin      Hargreaves
CIS 35A          00441
Assignment           4
Due         05-29-2023
Submitted   05-29-2023
*/

package Exercise1.src;

public class DriverTwo {

    public static void main(String[] args) {
        
        // using polymorphism
        // assigns specialsavings object to a variable type that extends the attributes of the savingsaccount class
        // lets us use the shared memebers and behaviors in the savings account class

        SpecialSavings saver1 = new SpecialSavings(2000.0);
        SpecialSavings saver2 = new SpecialSavings(3000.0);

        SavingsAccount.modifyAnnualInterestRate(0.05);

        saver1.depositMoney(10000.0);
        saver2.withdrawMoney(500.0);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("%s%.2f%s", "Saver 1 Balance: ", saver1.getSavingsBalance(), "\n");
        System.out.printf("%s%.2f%s", "Saver 2 Balance: ", saver2.getSavingsBalance(), "\n\n");

        saver1.withdrawMoney(3500.0);
        saver2.depositMoney(1200.0);

        // looped output to show progression of calculating interest and adding it to balance
        System.out.printf("Calcuating Monthly Interest for 5 months... \n\n");
        for (int i = 0; i < 5; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("%s%.2f%s", "Saver 1 Balance: ", saver1.getSavingsBalance(), "\n");
            System.out.printf("%s%.2f%s", "Saver 2 Balance: ", saver2.getSavingsBalance(), "\n\n");
        }
    }
}