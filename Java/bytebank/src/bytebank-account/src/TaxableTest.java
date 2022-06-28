public class TaxableTest {

    public static void main(String[] args) {

        CheckingAccount checkingAccount1 = new CheckingAccount(200, 2);
        checkingAccount1.depositCash(100.0);

        LifeInsurance lifeInsurance1 = new LifeInsurance();
        TaxCalculator calculator = new TaxCalculator();

        calculator.register(checkingAccount1);
        System.out.println(calculator.getTotalTax());
        calculator.register(lifeInsurance1);
        System.out.println(calculator.getTotalTax());

    }
}
