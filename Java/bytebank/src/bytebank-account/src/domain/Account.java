package domain;

/**
 * Class responsible for creation of new types of accounts
 * @author Luiza Zilio
 */
public abstract class Account {
    //attributes
    protected double balance = 0D;
    private int agency;
    private int number;
    private Client owner;
    private static int total; //to calculate the total of accounts => static means that is a class attribute

    public Account(int agency, int number){
        Account.total++; //you can use total++ instead
        if (agency < 1){
            throw new IllegalArgumentException("Invalid agency");
        }
        if (number < 1){
            throw new IllegalArgumentException("Invalid account number");
        }
        this.agency = agency;
        this.number = number;
    }


    /**
     * Method specified to draw cash from the current account
     * @author Luiza Zilio
     * @param value
     * @throws InsufficientFundsException
     */
    public void drawCash(double value) throws InsufficientFundsException{


        if (this.balance < value) {
            throw new InsufficientFundsException("Ops...Insufficient funds! Your balance: " + this.getBalance());
        }

        this.balance -= value;
        System.out.println("Succeed! Your balance now is: " + this.getBalance());
    }

    /**
     * @param value
     */
    public abstract void depositCash(double value);

    /**
     * @param value
     * @param destinyAccount
     * @throws InsufficientFundsException
     */
    public void transferCash(double value, Account destinyAccount) throws InsufficientFundsException{
        this.drawCash(value); //if drawException throws an exception it will stop working and reading the method)
        destinyAccount.depositCash(value);
    }

    //getters and setters
    public double getBalance() {
        return this.balance;
    }

    public void setOwner() {
        this.owner = new Client();
    }

    public Client getOwner() {
        return owner;
    }


    // static methods can only access static attributes
    public static int getTotal() { //static => class method
        return Account.total;
    }

    @Override
    public String toString() {
        return "account number: " + this.number + ", agency: " + this.agency;
    }
}
