
public class Client implements EmployeeWithValidation {

    private ValidationUtil util;

    public Client(){
        this.util = new ValidationUtil();
    }

    @Override
    public void setPassword(int password) {
        this.util.setPassword(password);
    }

    @Override
    public boolean validatePassword(int password) {
        return this.util.validatePassword(password);
    }
}
