package domain;

public class SavingsAccount extends Account {

    //constructor
    public SavingsAccount(int agency, int number){
        super(agency, number);
    }

    @Override
    public void depositCash(double value) {
        super.balance += value;
    }

    @Override
    public String toString() {
        return "SavingsAccount - " + super.toString();
    }
}
