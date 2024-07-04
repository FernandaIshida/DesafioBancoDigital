public abstract class Account implements IAccount{
    private static final int AGENCY_PATTERN = 1;
    private static int SEQUENTIAL = 1;
    protected int agency;
    protected int accountNumber;
    protected double balance;

    public Account() {
        this.agency = Account.AGENCY_PATTERN;
        this.accountNumber = SEQUENTIAL++;
    }
    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }
    public int getAgency() {
        return agency;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void printCommonInfos() {
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Account: %d", this.accountNumber));
        System.out.println(String.format("Balance: R$ %.2f", this.balance));
    }
}
