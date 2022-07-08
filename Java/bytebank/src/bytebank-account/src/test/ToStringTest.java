package test;

import domain.CheckingAccount;
import domain.SavingsAccount;

public class ToStringTest {
    public static void main(String[] args){
        Object checkingAccount = new CheckingAccount(111, 1111);
        Object savingsAccount = new SavingsAccount(222, 2222);

        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }
}
