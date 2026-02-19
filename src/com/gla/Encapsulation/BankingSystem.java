
import java.util.ArrayList;
import java.util.List;

public class BankingSystem {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount s = new SavingsAccount("SB101", "Rahul", 50000);
        CurrentAccount c = new CurrentAccount("CA202", "Priya", 80000);

        s.deposit(5000);
        c.withdraw(10000);

        s.applyForLoan(20000);
        c.applyForLoan(30000);

        accounts.add(s);
        accounts.add(c);


        for (BankAccount acc : accounts) {

            acc.displayAccountDetails();

            double interest = acc.calculateInterest();
            System.out.println("Interest : " + interest);

            Loanable loan = (Loanable) acc;
            System.out.println("Loan Eligible : " + loan.calculateLoanEligibility());

            System.out.println("--------------------------");
        }

    }

}
