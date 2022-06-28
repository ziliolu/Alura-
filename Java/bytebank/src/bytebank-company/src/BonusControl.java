public class BonusControl {

    private double counter;

    public void register(Employee f) {
        System.out.println();
        double bonusEmployee = f.getBonus();
        this.counter += bonusEmployee;
    }

    public double getCounter() {
        return counter;
    }

}