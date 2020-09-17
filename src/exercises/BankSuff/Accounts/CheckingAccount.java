package exercises.BankSuff.Accounts;

public class CheckingAccount extends BankAccount{

    private double fee;
    private final double overdrawAmount = 5;

    public CheckingAccount (int accountNo, double fee){
        super(accountNo); // calls parent constructor, sets two fields
        this.fee = fee;
    }

    public void collectFee(){
        this.balance -= this.fee;
    }

    @Override
    public void withdrawal(double amount) {
        if (amount < 0 || amount > this.balance + this.overdrawAmount) {
            throw new IllegalArgumentException();
        }
        this.balance -= amount;
    }

    public static void main (String [] args){
        CheckingAccount testChecking = new CheckingAccount(1, 5);
        SavingsAccount testSavings = new SavingsAccount(2, 1.5);
        testChecking.deposit(100);
        testSavings.deposit(100);

        testChecking.withdrawal((101));

        System.out.println(testChecking.getBalance());
    }
}
