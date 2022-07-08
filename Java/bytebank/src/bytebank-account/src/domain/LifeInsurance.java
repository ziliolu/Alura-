package domain;

public class LifeInsurance implements Taxable {

    @Override
    public double getTaxValue() {
        return 100;
    }

}
