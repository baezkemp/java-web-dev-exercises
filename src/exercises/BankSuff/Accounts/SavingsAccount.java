package exercises.BankSuff.Accounts;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(int accountNo, double interestRate){
        super(accountNo);
        this.interestRate = interestRate;
    }

//    public void compoundInterest(){
//        this.balance = this.balance()
//    }
}
