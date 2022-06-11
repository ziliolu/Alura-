public abstract class Account {
    //attributes
    protected double balance = 0D;
    private int agency;
    private int number;
    private Client owner;
    private static int total; //to calculate the total of accounts => static means that is a class attribute

    //constructor
    public Account(int agency, int number){
        Account.total++; //you can use total++ instead
        if (agency <= 0){
            System.out.println("You need a valid number for the agency. Please insert a positive number.");
        }
        if (number <= 0){
            System.out.println("You need a valid number for the account's number. Please insert a positive number.");
        }
        this.agency = agency;
        this.number = number;
    }

    //methods
    public boolean drawCash(double value){
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }
    public abstract void depositCash(double value);

    public boolean transferCash(double value, Account destinyAccount){
        if (this.balance >= value){
            this.balance -= value;
            destinyAccount.balance += value;
            return true;
        }
        return false;
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
}
