public class Main {
    public static void main(String[] args) {
        Account ca = new CheckingAccount();
        ca.deposit(100);

        Account sa = new SavingAccount();
        ca.transfer(100, sa);

        ca.printBalance();
        sa.printBalance();
    }
}
