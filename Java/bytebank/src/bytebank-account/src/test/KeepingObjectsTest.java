package test;

import domain.*;

public class KeepingObjectsTest {

    public static void main(String[] args) {
        KeepingObjects objectsArray = new KeepingObjects();

        Client client = new Client();
        CheckingAccount checkingAccount = new CheckingAccount(11, 22);
        SavingsAccount savingsAccount = new SavingsAccount(44, 55);

        objectsArray.add(client);
        objectsArray.add(checkingAccount);
        objectsArray.add(savingsAccount);
        System.out.println(objectsArray.objectsQuantity());
        System.out.println(objectsArray.getReference(0));
        System.out.println(objectsArray.getReference(1));
    }
}
