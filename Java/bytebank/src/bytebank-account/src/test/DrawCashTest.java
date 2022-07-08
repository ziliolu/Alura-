package test;

import domain.CheckingAccount;
import domain.InsufficientFundsException;

public class DrawCashTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(111, 2);

        account.depositCash(10D);

        try {
            account.drawCash(10D);
        } catch (InsufficientFundsException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(account.getBalance());

    }
}
