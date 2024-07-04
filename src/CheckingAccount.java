public class CheckingAccount extends Account{

    @Override
    public void printBalance() {
        System.out.println("*** Checking Account balance ***");
        printCommonInfos();
    }
}
