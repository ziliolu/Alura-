public class Administrator extends Employee implements EmployeeWithValidation{

    private int password;

    @Override
    public double getBonus() {
        return 50;
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean validatePassword(int password) {
        if(this.password == password) {
            return true;
        }
        return false;
    }
}
