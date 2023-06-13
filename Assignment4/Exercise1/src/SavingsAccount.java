/*
Collin      Hargreaves
CIS 35A          00441
Assignment           4
Due         05-29-2023
Submitted   05-29-2023
*/

package Exercise1.src;

public class SavingsAccount {

    // using protected access modifier so they are accessible in the subclass
        protected static double annualInterestRate;
        protected double savingsBalance;
    
    
    
        public SavingsAccount(double savingsBalance) {
            this.savingsBalance = savingsBalance;
        }
    
        public void calculateMonthlyInterest()  {
            double monthlyInterest = savingsBalance * (annualInterestRate / 12);
            savingsBalance = savingsBalance + monthlyInterest;
        }
    
        public static void modifyAnnualInterestRate(double newRate) {
            annualInterestRate = newRate;
        }
        
        public double getSavingsBalance() {
            return savingsBalance;
        }

        public void setSavingsBalance(double newBalance) {
            this.savingsBalance = newBalance;
        }

        public void depositMoney(double money) {
            savingsBalance = savingsBalance + money;
        }
    
        public void withdrawMoney(double money) {
            if (money <= savingsBalance) {
                savingsBalance = savingsBalance - money;
            } else {
                System.out.println("Not enough funds to withdraw...");
            }
        }
    
        
}
