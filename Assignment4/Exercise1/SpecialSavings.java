/*
Collin      Hargreaves
CIS 35A          00441
Assignment           4
Due         05-29-2023
Submitted   05-29-2023
*/

package Exercise1;

public class SpecialSavings extends SavingsAccount {

    private static final double INTEREST_RATE = 0.1;
    private static final double SPECIAL_BALANCE = 10000.0;
    

    public SpecialSavings(double savingsBalance) {
        super(savingsBalance);
    }

    // override method, this method replaces the method in savingsaccount
    
    public void calculateMonthlyInterest() {
        if (savingsBalance > SPECIAL_BALANCE) {
            double specialInterest = savingsBalance * (INTEREST_RATE / 12);
            savingsBalance = savingsBalance + specialInterest;
        } else {
            super.calculateMonthlyInterest();
        }
    }

    
}
