package domain;

public class CheckingAccount extends Account implements Taxable {

    //constructor
    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void depositCash(double value) {
        super.balance += value;
    }

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }

    @Override
    public void drawCash(double value) throws InsufficientFundsException {
        super.drawCash(value);
    }

    @Override
    public String toString() {
        return "CheckingAccount - " + super.toString();
    }
}
