
//create a new class to write the same code just one time --> composition
public class ValidationUtil {

    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean validatePassword(int password) {
        if(this.password == password) {
            return true;
        }
        return false;
    }

}
