
class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04;  // 4%
    private double loanAmount;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }


    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }


    @Override
    public void applyForLoan(double amount) {
        loanAmount = amount;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > loanAmount * 0.5;
    }

}
