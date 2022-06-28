public class AccountsTest {

    public static void main(String[] args) throws InsufficientFundsException{

        //classes have the same method as it's "mother"
        CheckingAccount cc = new CheckingAccount(100, 1);
        cc.depositCash(10D);

        SavingsAccount cp = new SavingsAccount(200, 2);
        cp.depositCash(20D);

        cc.transferCash(10D, cp);

        System.out.println(cp.getBalance());
        System.out.println(cc.getBalance());
    }
}
